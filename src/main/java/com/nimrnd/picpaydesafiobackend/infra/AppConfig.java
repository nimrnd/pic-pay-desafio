package com.nimrnd.picpaydesafiobackend.infra;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
