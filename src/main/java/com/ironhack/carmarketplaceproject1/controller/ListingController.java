package com.ironhack.carmarketplaceproject1.controller;

import com.ironhack.carmarketplaceproject1.enums.Status;
import com.ironhack.carmarketplaceproject1.model.Listing;
import com.ironhack.carmarketplaceproject1.repository.ListingRepository;
import com.ironhack.carmarketplaceproject1.service.ListingService;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/listings")
public class ListingController {
    private final ListingRepository listingRepository;
    private final ListingService listingService;

    public ListingController(ListingRepository listingRepository, ListingService listingService) {
        this.listingRepository = listingRepository;
        this.listingService = listingService;
    }
    @PostMapping("/listings")
    public List<Listing> getListingsByCarModelAndLocation(@RequestParam String model, @RequestParam String location) {
        return listingService.getListingsByCarModelAndLocation(model, location);
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

