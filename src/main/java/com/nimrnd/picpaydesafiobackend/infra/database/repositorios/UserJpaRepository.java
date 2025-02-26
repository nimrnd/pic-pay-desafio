package com.nimrnd.picpaydesafiobackend.infra.database.repositorios;

import com.nimrnd.picpaydesafiobackend.domain.user.User;
import com.nimrnd.picpaydesafiobackend.domain.user.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long>, UserRepository {

  Optional<User> encontrarPorCpf(String cpf);
}
