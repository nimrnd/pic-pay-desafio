package com.nimrnd.picpaydesafiobackend.application.service;

import com.nimrnd.picpaydesafiobackend.domain.user.User;

import java.math.BigDecimal;

public interface TransactionAuthorizationService {
  boolean isTransactionAuthorized(User payer, BigDecimal value);
}
