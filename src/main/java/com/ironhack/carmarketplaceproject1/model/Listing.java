package com.ironhack.carmarketplaceproject1.model;


import com.ironhack.carmarketplaceproject1.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "listings")
public class Listing {
    @Id
    private Long id;
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private Status listingtype;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listing")
    private List<Car> cars;



    public Listing(LocalDate date, Status listingtype) {
        this.date = date;
        this.listingtype = listingtype;
    }
}
