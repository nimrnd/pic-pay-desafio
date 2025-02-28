package com.nimrnd.picpaydesafiobackend.application.dto;

public class NotificationResponseDTO {

  private String status;

  public boolean isDelivered() {
    return "success".equals(status);
  }
}
