package com.nimrnd.picpaydesafiobackend.infra.database.entity;

import com.nimrnd.picpaydesafiobackend.domain.user.UserType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name= "user")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserORM {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "full_name")
  private String fullName;

  @Column(name = "cpf", unique = true)
  private String cpf;

  @Column(name = "email", unique = true)
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "wallet", precision = 15, scale = 2)
  private BigDecimal wallet;

  @Enumerated(EnumType.STRING)
  private UserType userType;
}
