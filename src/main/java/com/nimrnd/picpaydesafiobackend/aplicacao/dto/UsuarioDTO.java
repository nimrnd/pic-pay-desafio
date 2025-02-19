package com.nimrnd.picpaydesafiobackend.aplicacao.dto;

import com.nimrnd.picpaydesafiobackend.dominio.usuario.TipoUsuario;
import lombok.Builder;

@Builder
public record UsuarioDTO(
    Long id,
    String nomeCompleto,
    String cpf,
    String email,
    String senha,
    TipoUsuario tipoUsuario
) {
}
