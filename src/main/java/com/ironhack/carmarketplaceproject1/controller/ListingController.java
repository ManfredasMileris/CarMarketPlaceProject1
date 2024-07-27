package com.ironhack.carmarketplaceproject1.controller;

import com.ironhack.carmarketplaceproject1.enums.Status;
import com.ironhack.carmarketplaceproject1.model.Listing;
import com.ironhack.carmarketplaceproject1.repository.ListingRepository;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/listings")
public class ListingController {
    private final ListingRepository listingRepository;

    public ListingController(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }
}
    //@GetMapping("/bylocalDate")
    //public List<Listing>getListingsByDate(@RequestParam final Local date) {
        //return listingRepository.findByLocalDate(LocalDate.now());
   // }
   // @GetMapping("/bylistingtype")
   // public List<Listing> getListingsByType(@RequestParam Status listingtype) {
   //     return listingRepository.findByListingType(listingtype);
   // }
   // }

