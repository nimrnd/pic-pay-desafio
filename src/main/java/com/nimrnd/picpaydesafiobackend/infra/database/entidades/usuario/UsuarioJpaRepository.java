package com.nimrnd.picpaydesafiobackend.infra.database.entidades.usuario;

import com.nimrnd.picpaydesafiobackend.dominio.usuario.Usuario;
import com.nimrnd.picpaydesafiobackend.dominio.usuario.UsuarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioJpaRepository implements UsuarioRepository {

  @PersistenceContext
  private EntityManager entityManager;


  @Override
  public void salvar(Usuario usuario) {
    
  }

  @Override
  public boolean emailExiste(String email) {
    return false;
  }

  @Override
  public boolean cpfExiste(String cpf) {
    return false;
  }
}
