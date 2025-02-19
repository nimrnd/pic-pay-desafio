package com.nimrnd.picpaydesafiobackend.infra.database.entidades.usuario;

import com.nimrnd.picpaydesafiobackend.dominio.usuario.Usuario;

public final class UsuarioInfraMapper {

  public static Usuario toDomain(UsuarioORM entity) {
    if (entity == null) {
      return null;
    }

    return Usuario.builder()
        .id(entity.getId())
        .nomeCompleto(entity.getNomeCompleto())
        .cpf(entity.getCpf())
        .email(entity.getEmail())
        .senha(entity.getSenha())
        .tipoUsuario(entity.getTipoUsuario())
        .build();
  }

  public static UsuarioORM toORM(Usuario domain){
    if (domain == null) {
      return null;
    }

    return UsuarioORM.builder()
        .id(domain.getId())
        .nomeCompleto(domain.getNomeCompleto())
        .cpf(domain.getCpf())
        .email(domain.getEmail())
        .senha(domain.getSenha())
        .tipoUsuario(domain.getTipoUsuario())
        .build();
  }
}
