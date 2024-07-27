package com.ironhack.carmarketplaceproject1.controller;

import com.ironhack.carmarketplaceproject1.enums.Status;
import com.ironhack.carmarketplaceproject1.model.Listing;
import com.ironhack.carmarketplaceproject1.repository.ListingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/listings")
public class ListingController {
    private final ListingRepository listingRepository;

    public ListingController(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }

   // @GetMapping("/byCarAttribute")
   // public List<Listing>getListingsByCarAttribute(@RequestParam String carAttribute){
     //  return listingRepository.findByCarAttribute(carAttribute);
   // }
    //@GetMapping("/byListingType")
    //public List<Listing> getListingsByType(@RequestParam Status listingType) {
      //  return listingRepository.findByListingType(listingType);
    }

