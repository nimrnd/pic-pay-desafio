package com.nimrnd.picpaydesafiobackend.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthorizationResponseDTO {

  private String status;

  @JsonProperty("data")
  private AuthorizationData data;

  public static class AuthorizationData {
    private boolean authorization;
  }

  public boolean isAuthorized() {
    return "sucess".equals(status) && data != null && data.authorization;
  }
}
