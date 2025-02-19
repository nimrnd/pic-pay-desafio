package com.nimrnd.picpaydesafiobackend.infra.mappers;

import com.nimrnd.picpaydesafiobackend.dominio.transacao.Transacao;
import com.nimrnd.picpaydesafiobackend.infra.database.entidades.TransacaoORM;

public class TransacaoInfraMapper {

  public TransacaoORM toEntity(Transacao domain) {
    if (domain == null) {
      return null;
    }

    return TransacaoORM.builder()
        .id(domain.getId())
        .valor(domain.getValor())
        .pagador(domain.getPagador())
        .recebedor(domain.getRecebedor())
        .timestamp(domain.getTimestamp())
        .build();
  }

  public Transacao toDomain(TransacaoORM entity) {
    if (entity == null) {
      return null;
    }

    return Transacao.builder()
        .id(entity.getId())
        .valor(entity.getValor())
        .pagador(entity.getPagador())
        .recebedor(entity.getRecebedor())
        .build();
  }
}
