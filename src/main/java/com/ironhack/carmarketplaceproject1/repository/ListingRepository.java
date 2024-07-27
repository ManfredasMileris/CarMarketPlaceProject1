package com.ironhack.carmarketplaceproject1.repository;

import com.ironhack.carmarketplaceproject1.enums.Status;
import com.ironhack.carmarketplaceproject1.model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ListingRepository extends JpaRepository<Listing, Long> {
    //List<Listing> findByLocalDate(LocalDate localDate);
    //List<Listing> findByListingType(Status listingtype);

}
