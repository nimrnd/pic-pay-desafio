package com.nimrnd.picpaydesafiobackend.domain.user;

import java.util.Optional;

public interface UserRepository {

  void save(User user);

  Optional<User> findByCpf(String cpf);

  Optional<User> findById(Long id);
}

