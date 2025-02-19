package com.nimrnd.picpaydesafiobackend.aplicacao.mapper;

import com.nimrnd.picpaydesafiobackend.aplicacao.dto.TransacaoDTO;
import com.nimrnd.picpaydesafiobackend.dominio.transacao.Transacao;

public class TransacaoApplicationMapper {

  public TransacaoDTO toDTO(Transacao transacao) {
    if (transacao == null) {
      return null;
    }

    return TransacaoDTO.builder()
        .id(transacao.getId())
        .valor(transacao.getValor())
        .pagador(transacao.getPagador())
        .recebedor(transacao.getRecebedor())
        .timestamp(transacao.getTimestamp())
        .build();
  }

  public Transacao toDomain(TransacaoDTO dto) {
    if (dto == null) {
      return null;
    }

    return Transacao.builder()
        .id(dto.id())
        .valor(dto.valor())
        .pagador(dto.pagador())
        .recebedor(dto.recebedor())
        .timestamp(dto.timestamp())
        .build();
  }
}
