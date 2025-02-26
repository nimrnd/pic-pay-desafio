package com.nimrnd.picpaydesafiobackend.application.mapper;

import com.nimrnd.picpaydesafiobackend.application.dto.UserDTO;
import com.nimrnd.picpaydesafiobackend.domain.user.User;

public class UserApplicationMapper {

  public UserDTO toDTO(User user) {
    if (user == null) {
      return null;
    }

    return UserDTO.builder()
        .id(user.getId())
        .fullName((user.getFullName()))
        .cpf(user.getCpf())
        .email(user.getEmail())
        .password(user.getPassword())
        .wallet(user.getWallet())
        .userType(user.getUserType())
        .build();
  }

  public User toDomain(UserDTO userDTO) {
    if (userDTO == null) {
      return null;
    }

    return User.builder()
        .id(userDTO.id())
        .fullName(userDTO.fullName())
        .cpf(userDTO.cpf())
        .email(userDTO.email())
        .password(userDTO.password())
        .wallet(userDTO.wallet())
        .userType(userDTO.userType())
        .build();
  }
}
