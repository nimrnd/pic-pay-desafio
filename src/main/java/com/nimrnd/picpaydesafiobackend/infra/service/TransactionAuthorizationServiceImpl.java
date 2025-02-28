package com.nimrnd.picpaydesafiobackend.infra.service;

import com.nimrnd.picpaydesafiobackend.application.dto.AuthorizationResponseDTO;
import com.nimrnd.picpaydesafiobackend.application.service.TransactionAuthorizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class TransactionAuthorizationServiceImpl implements TransactionAuthorizationService {

  private static final String AUTHORIZATION_URL = "https://util.devi.tools/api/v2/authorize";

  private final RestTemplate restTemplate;

  public boolean isTransactionAuthorized() {
    try {
      AuthorizationResponseDTO response = restTemplate.getForObject(AUTHORIZATION_URL, AuthorizationResponseDTO.class);
      return response != null && response.isAuthorized();
    } catch (Exception e) {
      return false;
    }
  }
}
