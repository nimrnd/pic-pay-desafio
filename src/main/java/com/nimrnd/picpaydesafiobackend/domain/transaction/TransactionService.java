package com.nimrnd.picpaydesafiobackend.domain.transaction;

import com.nimrnd.picpaydesafiobackend.application.service.TransactionAuthorizationService;
import com.nimrnd.picpaydesafiobackend.domain.user.User;
import com.nimrnd.picpaydesafiobackend.domain.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TransactionService {

  @Autowired
  private UserService userService;

  private final TransactionAuthorizationService transactionAuthorizationService;

  private final TransactionRepository transactionRepository;

  public void createTransaction(Transaction transaction) throws Exception {
    User payer = this.userService.findById(transaction.getPayer().getId());
    User payee = this.userService.findById(transaction.getPayee().getId());

    userService.validateTransaction(payer, transaction.getValue());

    boolean isAuthorized = this.transactionAuthorizationService.isTransactionAuthorized(payer, transaction.getValue());

    if (!isAuthorized) {
      throw new Exception("Transaction not allowed");
    }

    Transaction newTransaction = new Transaction();
    newTransaction.setValue(transaction.getValue());
    newTransaction.setPayer(transaction.getPayer());
    newTransaction.setPayee(transaction.getPayee());
    newTransaction.setTimestamp(LocalDateTime.now());

    payer.setWallet(payer.getWallet().subtract(transaction.getValue()));
    payee.setWallet(payee.getWallet().add(transaction.getValue()));

    this.transactionRepository.save(newTransaction);
    this.userService.saveUser(payer);
    this.userService.saveUser(payee);
  }
}
