package com.nimrnd.picpaydesafiobackend.domain.user;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private Long id;
  private String fullName;
  private String cpf;
  private String email;
  private String password;
  private BigDecimal wallet;
  private UserType userType;
}
