package com.nimrnd.picpaydesafiobackend.aplicacao.mapper;

import com.nimrnd.picpaydesafiobackend.aplicacao.dto.UsuarioDTO;
import com.nimrnd.picpaydesafiobackend.dominio.usuario.Usuario;

public class UsuarioApplicationMapper {

  public UsuarioDTO toDTO(Usuario usuario) {
    if (usuario == null) {
      return null;
    }

    return UsuarioDTO.builder()
        .id(usuario.getId())
        .nomeCompleto((usuario.getNomeCompleto()))
        .cpf(usuario.getCpf())
        .email(usuario.getEmail())
        .senha(usuario.getSenha())
        .tipoUsuario(usuario.getTipoUsuario())
        .build();
  }

  public Usuario toDomain(UsuarioDTO usuarioDTO) {
    if (usuarioDTO == null) {
      return null;
    }

    return Usuario.builder()
        .id(usuarioDTO.id())
        .nomeCompleto(usuarioDTO.nomeCompleto())
        .cpf(usuarioDTO.nomeCompleto())
        .email(usuarioDTO.email())
        .senha(usuarioDTO.senha())
        .tipoUsuario(usuarioDTO.tipoUsuario())
        .build();
  }
}
