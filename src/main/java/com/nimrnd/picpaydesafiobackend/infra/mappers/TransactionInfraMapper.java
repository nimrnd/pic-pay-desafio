package com.nimrnd.picpaydesafiobackend.infra.mappers;

import com.nimrnd.picpaydesafiobackend.domain.transaction.Transaction;
import com.nimrnd.picpaydesafiobackend.infra.database.entity.TransactionORM;

public final class TransactionInfraMapper {

  public static TransactionORM toEntity(Transaction domain) {
    if (domain == null) {
      return null;
    }

    return TransactionORM.builder()
        .id(domain.getId())
        .value(domain.getValue())
        .payer(domain.getPayer())
        .payee(domain.getPayee())
        .timestamp(domain.getTimestamp())
        .build();
  }

  public static Transaction toDomain(TransactionORM entity) {
    if (entity == null) {
      return null;
    }

    return Transaction.builder()
        .id(entity.getId())
        .value(entity.getValue())
        .payer(entity.getPayer())
        .payee(entity.getPayee())
        .build();
  }
}
