package com.nimrnd.picpaydesafiobackend.domain.transaction;

import com.nimrnd.picpaydesafiobackend.domain.user.User;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
  private Long id;
  private BigDecimal value;
  private User payer;
  private User payee;
  private LocalDateTime timestamp;
}
