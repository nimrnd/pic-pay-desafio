package com.nimrnd.picpaydesafiobackend.infra.database.repository;

import com.nimrnd.picpaydesafiobackend.domain.user.User;
import com.nimrnd.picpaydesafiobackend.infra.mappers.UserInfraMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl {

  private final UserJpaRepository userJpaRepository;

  public void save(User user) {
    userJpaRepository.save(UserInfraMapper.toORM(user));
  }

  public Optional<User> findById(Long id) {
    return userJpaRepository.findById(id).map(UserORM -> UserInfraMapper.toDomain(UserORM));
  }

  public Optional<User> findByCpf(String cpf) {
    return userJpaRepository.findByCpf(cpf).map(UserORM -> UserInfraMapper.toDomain(UserORM));
  }
}
