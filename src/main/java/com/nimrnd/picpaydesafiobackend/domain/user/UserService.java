package com.nimrnd.picpaydesafiobackend.domain.user;

import com.nimrnd.picpaydesafiobackend.infra.database.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

  @Autowired
  private UserRepositoryImpl userRepository;

  public void validateTransaction(User payer, BigDecimal value) throws Exception {
    if (payer.getUserType() == UserType.MERCHANT) {
      throw new Exception("Merchant user type is not allowed to execute transactions");
    }

    if (payer.getWallet().compareTo(value) <= 0) {
      throw new Exception("User does not have enough balance to proceed with this transaction");
    }
  }

  public User findById(Long id) throws Exception{
    return this.userRepository.findById(id).orElseThrow(() -> new Exception("User not found"));
  }

  public void saveUser(User user) {
    this.userRepository.save(user);
  }
}
