package com.nimrnd.picpaydesafiobackend.infra.database.entidades;

import com.nimrnd.picpaydesafiobackend.dominio.usuario.TipoUsuario;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name= "usuario")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioORM {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nome_completo")
  private String nomeCompleto;

  @Column(name = "cpf", unique = true)
  private String cpf;

  @Column(name = "email", unique = true)
  private String email;

  @Column(name = "senha")
  private String senha;

  @Column(name = "carteira", precision = 15, scale = 2)
  private BigDecimal carteira;

  @Enumerated(EnumType.STRING)
  private TipoUsuario tipoUsuario;
}
