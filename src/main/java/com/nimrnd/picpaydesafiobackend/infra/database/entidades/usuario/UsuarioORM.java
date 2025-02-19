package com.nimrnd.picpaydesafiobackend.infra.database.entidades.usuario;

import com.nimrnd.picpaydesafiobackend.dominio.usuario.TipoUsuario;
import jakarta.persistence.*;
import lombok.*;

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

  @Column(name = "cpf")
  private String cpf;

  @Column(name = "email")
  private String email;

  @Column(name = "senha")
  private String senha;

  @Enumerated(EnumType.STRING)
  private TipoUsuario tipoUsuario;
}
