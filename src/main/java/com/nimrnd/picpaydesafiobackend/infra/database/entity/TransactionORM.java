package com.nimrnd.picpaydesafiobackend.infra.database.entity;

import com.nimrnd.picpaydesafiobackend.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionORM {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "value")
  private BigDecimal value;

  @ManyToOne
  @JoinColumn(name = "payer_id")
  private User payer;

  @ManyToOne
  @JoinColumn(name = "payee_id")
  private UserORM payee;

  @Column(name = "timestamp")
  private LocalDateTime timestamp;
}
