package com.nimrnd.picpaydesafiobackend.domain.notification;

import com.nimrnd.picpaydesafiobackend.application.dto.NotificationRequestDTO;
import com.nimrnd.picpaydesafiobackend.application.service.NotificationSenderService;
import com.nimrnd.picpaydesafiobackend.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

  private final NotificationSenderService notificationSenderService;

  public void sendNotification(User user, String message) throws Exception {
    String email = user.getEmail();
    NotificationRequestDTO notificationRequest = new NotificationRequestDTO(email, message);

    boolean hasNotificationBeenDelivered = this.notificationSenderService.isNotificationDelivered();

    if (!hasNotificationBeenDelivered) {
      throw new Exception("The notification could not be sent");
    }
  }

}
