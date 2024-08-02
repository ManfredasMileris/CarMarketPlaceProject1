package com.ironhack.carmarketplaceproject1.model;


import com.ironhack.carmarketplaceproject1.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "listings")
public class Listing {
    @Id
    private Long id;
    private String location;
    private String description;
    //private double price;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    @Enumerated(EnumType.STRING)
    private Status listingtype;

    @ManyToOne
    private Car car;

    public Listing(Status listingtype, LocalDateTime modifiedDate, LocalDateTime createdDate, String description, String location, double price) {
        this.listingtype = listingtype;
        this.modifiedDate = modifiedDate;
        this.createdDate = createdDate;
        this.description = description;
        this.location = location;
       // this.price = price;
    }
}



