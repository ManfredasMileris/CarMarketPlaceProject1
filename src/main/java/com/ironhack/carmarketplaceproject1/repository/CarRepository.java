package com.ironhack.carmarketplaceproject1.repository;


import com.ironhack.carmarketplaceproject1.enums.CarStatus;
import com.ironhack.carmarketplaceproject1.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByModel(String model);
    List<Car>findByBrand(String brand);
    List<Car>findByYear(int year);
    List<Car>findByPrice(double price);
    List<Car>findByCondition(CarStatus CarStatus);
    List<Car> findByPriceBetween(int minPrice, int maxPrice);
}
