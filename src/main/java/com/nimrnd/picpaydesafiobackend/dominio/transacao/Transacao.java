package com.nimrnd.picpaydesafiobackend.dominio.transacao;

import com.nimrnd.picpaydesafiobackend.dominio.usuario.Usuario;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transacao {
  private Long id;
  private BigDecimal valor;
  private Usuario pagador;
  private Usuario recebedor;
  private LocalDateTime timestamp;
}
