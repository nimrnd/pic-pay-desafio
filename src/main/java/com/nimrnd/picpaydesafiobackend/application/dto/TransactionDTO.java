package com.nimrnd.picpaydesafiobackend.application.dto;

import com.nimrnd.picpaydesafiobackend.domain.user.User;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
public record TransactionDTO(
    Long id,
    BigDecimal value,
    User payer,
    User payee,
    LocalDateTime timestamp
    ) {}
