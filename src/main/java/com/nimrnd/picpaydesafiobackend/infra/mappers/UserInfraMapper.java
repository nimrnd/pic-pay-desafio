package com.nimrnd.picpaydesafiobackend.infra.mappers;

import com.nimrnd.picpaydesafiobackend.domain.user.User;
import com.nimrnd.picpaydesafiobackend.infra.database.entity.UserORM;

public final class UserInfraMapper {

  public static User toDomain(UserORM entity) {
    if (entity == null) {
      return null;
    }

    return User.builder()
        .id(entity.getId())
        .fullName(entity.getFullName())
        .cpf(entity.getCpf())
        .email(entity.getEmail())
        .password(entity.getPassword())
        .wallet(entity.getWallet())
        .userType(entity.getUserType())
        .build();
  }

  public static UserORM toORM(User domain){
    if (domain == null) {
      return null;
    }

    return UserORM.builder()
        .id(domain.getId())
        .fullName(domain.getFullName())
        .cpf(domain.getCpf())
        .email(domain.getEmail())
        .password(domain.getPassword())
        .wallet(domain.getWallet())
        .userType(domain.getUserType())
        .build();
  }
}
