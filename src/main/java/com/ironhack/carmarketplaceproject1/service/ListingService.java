package com.ironhack.carmarketplaceproject1.service;

import com.ironhack.carmarketplaceproject1.model.Listing;
import com.ironhack.carmarketplaceproject1.repository.ListingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ListingService {
    @Autowired
    private ListingRepository listingRepository;

    public List<Listing> getAllListings() {
        return listingRepository.findAll();
    }
    //public List <Listing>findListingsByLocation(String location){
    //  return listingRepository.findByLocation(location);

    // }
    public List<Listing> getListingsByCarModelAndLocation(String model, String location) {
        return listingRepository.findByCarModelAndLocation(model, location);
    }
}
