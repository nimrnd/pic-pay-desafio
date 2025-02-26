package com.nimrnd.picpaydesafiobackend.application.dto;

import com.nimrnd.picpaydesafiobackend.domain.user.UserType;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record UserDTO(
    Long id,
    String fullName,
    String cpf,
    String email,
    String password,
    BigDecimal wallet,
    UserType userType
) {}
