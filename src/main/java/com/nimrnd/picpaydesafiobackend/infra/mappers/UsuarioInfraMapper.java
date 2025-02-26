package com.nimrnd.picpaydesafiobackend.infra.mappers;

import com.nimrnd.picpaydesafiobackend.domain.user.Usuario;
import com.nimrnd.picpaydesafiobackend.infra.database.entity.UserORM;

public final class UsuarioInfraMapper {

  public static Usuario toDomain(UserORM entity) {
    if (entity == null) {
      return null;
    }

    return Usuario.builder()
        .id(entity.getId())
        .nomeCompleto(entity.getNomeCompleto())
        .cpf(entity.getCpf())
        .email(entity.getEmail())
        .senha(entity.getSenha())
        .carteira(entity.getCarteira())
        .tipoUsuario(entity.getTipoUsuario())
        .build();
  }

  public static UserORM toORM(Usuario domain){
    if (domain == null) {
      return null;
    }

    return UserORM.builder()
        .id(domain.getId())
        .nomeCompleto(domain.getNomeCompleto())
        .cpf(domain.getCpf())
        .email(domain.getEmail())
        .senha(domain.getSenha())
        .carteira(domain.getCarteira())
        .tipoUsuario(domain.getTipoUsuario())
        .build();
  }
}
