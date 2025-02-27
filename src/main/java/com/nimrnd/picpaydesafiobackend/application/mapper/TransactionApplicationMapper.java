package com.nimrnd.picpaydesafiobackend.application.mapper;

import com.nimrnd.picpaydesafiobackend.application.dto.TransactionDTO;
import com.nimrnd.picpaydesafiobackend.domain.transaction.Transaction;
import com.nimrnd.picpaydesafiobackend.domain.user.User;

public final class TransactionApplicationMapper {

  public static TransactionDTO toDTO(Transaction transaction) {
    if (transaction == null) {
      return null;
    }

    return TransactionDTO.builder()
        .id(transaction.getId())
        .value(transaction.getValue())
        .payer(UserApplicationMapper.toDTO(transaction.getPayer()))
        .payee(UserApplicationMapper.toDTO(transaction.getPayee()))
        .timestamp(transaction.getTimestamp())
        .build();
  }

  public static Transaction toDomain(TransactionDTO dto) {
    if (dto == null) {
      return null;
    }

    return Transaction.builder()
        .id(dto.id())
        .value(dto.value())
        .payer(UserApplicationMapper.toDomain(dto.payer()))
        .payee(UserApplicationMapper.toDomain(dto.payee()))
        .timestamp(dto.timestamp())
        .build();
  }
}
