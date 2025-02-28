package com.nimrnd.picpaydesafiobackend.infra.service;

import com.nimrnd.picpaydesafiobackend.application.dto.NotificationRequestDTO;
import com.nimrnd.picpaydesafiobackend.application.dto.NotificationResponseDTO;
import com.nimrnd.picpaydesafiobackend.application.service.NotificationSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class NotificationSenderServiceImpl implements NotificationSenderService {

  private static final String NOTIFICATION_URL = "https://util.devi.tools/api/v1/notify";

  private final RestTemplate restTemplate;

  private final NotificationRequestDTO notificationRequest;

  @Override
  public boolean isNotificationDelivered() {
    try {
      NotificationResponseDTO response = restTemplate.postForObject(NOTIFICATION_URL, notificationRequest, NotificationResponseDTO.class);
      return response != null && response.isDelivered();
    } catch (Exception e) {
      return false;
    }
  }
}
