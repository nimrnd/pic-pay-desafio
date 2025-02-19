package com.nimrnd.picpaydesafiobackend.aplicacao.dto;

import com.nimrnd.picpaydesafiobackend.dominio.usuario.Usuario;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
public record TransacaoDTO (
    Long id,
    BigDecimal valor,
    Usuario pagador,
    Usuario recebedor,
    LocalDateTime timestamp
    ) {}
