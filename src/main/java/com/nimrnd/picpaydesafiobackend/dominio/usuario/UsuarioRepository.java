package com.nimrnd.picpaydesafiobackend.dominio.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository {
  void salvar(Usuario usuario);
  boolean emailExiste(String email);
  boolean cpfExiste(String cpf);
}
