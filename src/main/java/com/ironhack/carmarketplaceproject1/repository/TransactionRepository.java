package com.ironhack.carmarketplaceproject1.repository;

import com.ironhack.carmarketplaceproject1.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
