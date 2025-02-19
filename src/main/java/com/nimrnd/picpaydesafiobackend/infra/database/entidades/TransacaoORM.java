package com.nimrnd.picpaydesafiobackend.infra.database.entidades;

import com.nimrnd.picpaydesafiobackend.dominio.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transacao")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransacaoORM {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "valor")
  private BigDecimal valor;

  @ManyToOne
  @JoinColumn(name = "pagador_id")
  private Usuario pagador;

  @ManyToOne
  @JoinColumn(name = "recebedor_id")
  private Usuario recebedor;

  @Column(name = "timestamp")
  private LocalDateTime timestamp;
}
