package com.ironhack.carmarketplaceproject1.repository;


import com.ironhack.carmarketplaceproject1.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByModel(String model);
    List<Car>findByBrand(String brand);
    List<Car>findByYear(int year);
    List<Car>findByPriceBetween(double minPrice, double maxPrice);
    List<Car> findByYearBetween(int startYear, int endYear);
    @Query("SELECT c.model, l.location FROM Car c JOIN Listing l ON c.id = l.car.id WHERE c.model = :model AND l.location = :location")
    List<Object[]> findModelAndLocationByModelAndLocation(@Param("model") String model, @Param("location") String location);
    //List<Car>findByPriceLessThan(double price);
    //List<Car> getCarsByPrice(double minPrice, double maxPrice);
    //List<Car> findByPriceBetween(double minPrice, double maxPrice);

   // List<Car> findByPrice(double minPrice, double maxPrice);
//    List<Car>findByCondition(CarStatus CarStatus);
//    List<Car> findByPriceBetween(int minPrice, int maxPrice);
}
