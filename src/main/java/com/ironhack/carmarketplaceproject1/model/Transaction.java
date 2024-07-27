package com.ironhack.carmarketplaceproject1.model;


import com.ironhack.carmarketplaceproject1.enums.TransactionStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue
    private long id;
    private TransactionStatus TransactionType;
    private double price;
    private LocalDateTime Date;

    public Transaction(TransactionStatus transactionType, double price, LocalDateTime date) {
        TransactionType = transactionType;
        this.price = price;
        Date = date;
    }
}
