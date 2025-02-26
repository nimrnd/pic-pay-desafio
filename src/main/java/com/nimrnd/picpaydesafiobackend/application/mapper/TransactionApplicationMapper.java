package com.nimrnd.picpaydesafiobackend.application.mapper;

import com.nimrnd.picpaydesafiobackend.application.dto.TransactionDTO;
import com.nimrnd.picpaydesafiobackend.domain.transaction.Transaction;

public class TransactionApplicationMapper {

  public TransactionDTO toDTO(Transaction transaction) {
    if (transaction == null) {
      return null;
    }

    return TransactionDTO.builder()
        .id(transaction.getId())
        .value(transaction.getValue())
        .payer(transaction.getPayer())
        .payee(transaction.getPayee())
        .timestamp(transaction.getTimestamp())
        .build();
  }

  public Transaction toDomain(TransactionDTO dto) {
    if (dto == null) {
      return null;
    }

    return Transaction.builder()
        .id(dto.id())
        .value(dto.value())
        .payer(dto.payer())
        .payee(dto.payee())
        .timestamp(dto.timestamp())
        .build();
  }
}
