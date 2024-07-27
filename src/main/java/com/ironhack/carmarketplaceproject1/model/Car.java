package com.ironhack.carmarketplaceproject1.model;


import com.ironhack.carmarketplaceproject1.enums.CarStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private String model;
    private int year;
    private double price;
    private CarStatus condition;
    @ManyToOne
    @JoinColumn(name = "listing_id")
    private Listing listing;

    public Car(String model,String brand, int year, double price, CarStatus condition) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.condition = condition;
    }
}
