package com.nimrnd.picpaydesafiobackend.infra.database.repository;

import com.nimrnd.picpaydesafiobackend.domain.transaction.Transaction;
import com.nimrnd.picpaydesafiobackend.domain.transaction.TransactionRepository;
import com.nimrnd.picpaydesafiobackend.infra.mappers.TransactionInfraMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TransactionRepositoryImpl implements TransactionRepository {

  private final TransactionJpaRepository transactionJpaRepository;

  public void save(Transaction transaction) {
    transactionJpaRepository.save(TransactionInfraMapper.toEntity(transaction));
  }
}
