package com.ironhack.carmarketplaceproject1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "sellers")
public class Seller {
    @Id
    @GeneratedValue
    private Long id;
    private int listing;
    private double rating;


    public Seller(int listing, double rating) {
        this.listing = listing;
        this.rating = rating;
    }
}