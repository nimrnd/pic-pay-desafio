package com.nimrnd.picpaydesafiobackend.dominio.usuario;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
  private Long id;
  private String nomeCompleto;
  private String cpf;
  private String email;
  private String senha;
  private TipoUsuario tipoUsuario;
}
