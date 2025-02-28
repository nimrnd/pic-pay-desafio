package com.nimrnd.picpaydesafiobackend.infra.database.repository;

import com.nimrnd.picpaydesafiobackend.infra.database.entity.TransactionORM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionJpaRepository extends JpaRepository<TransactionORM, Long> {
}
