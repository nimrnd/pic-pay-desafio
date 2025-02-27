package com.nimrnd.picpaydesafiobackend.infra.database.repository;

import com.nimrnd.picpaydesafiobackend.infra.database.entity.UserORM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserJpaRepository extends JpaRepository<UserORM, Long> {

  Optional<UserORM> findByCpf(String cpf);

  Optional<UserORM> findById(Long id);
}
