package com.nimrnd.picpaydesafiobackend.infra.database.repositorios;

import com.nimrnd.picpaydesafiobackend.dominio.usuario.Usuario;
import com.nimrnd.picpaydesafiobackend.dominio.usuario.UsuarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UsuarioJpaRepository implements UsuarioRepository {

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public void salvar(Usuario usuario) {
    
  }

  @Override
  public Optional<Usuario> encontrarPorCpf(String cpf) {
    return Optional.empty();
  }

  @Override
  public Optional<Usuario> encontrarPorId(Long id) {
    return Optional.empty();
  }
}
