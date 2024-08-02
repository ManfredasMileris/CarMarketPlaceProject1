package com.ironhack.carmarketplaceproject1.controller;

import com.ironhack.carmarketplaceproject1.model.Car;
import com.ironhack.carmarketplaceproject1.repository.CarRepository;
import com.ironhack.carmarketplaceproject1.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarRepository carRepository;
    private final CarService carService;

    @GetMapping
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
    @GetMapping("/{id}")
    public Car getCarById(@PathVariable("id") long id) {
        return carRepository.findById(id).orElse(null);
    }
     @GetMapping("/model/{model}")
     public List<Car> getCarsByModel(@PathVariable String model) {
        return carService.getCarsByModel(model);
    }
    @GetMapping("/brand/{brand}")
    public List<Car> findByBrand(@PathVariable String brand) {
        return carService.findByBrand(brand);
    }
    @GetMapping("/year/{year}")
    public List<Car> findByYear(@PathVariable int year) {
        return carService.findByYear(year);
    }
    @GetMapping("/price-range")
    public List<Car>getCarsInPriceRange(@RequestParam double minPrice, @RequestParam double maxPrice) {
        return carService.findCarsByPriceRange(minPrice, maxPrice);
    }
    @GetMapping("/year-range")
    public ResponseEntity<List<Car>> getCarsInYearRange(@RequestParam int startYear, @RequestParam int endYear) {
        List<Car> cars = carService.getCarsInYearRange(startYear, endYear);
        return ResponseEntity.ok(cars);
    }


    @PostMapping("/PostCar/{id}")
    public Car addCar(@PathVariable("id") long user, @RequestBody Car car) {
        return carRepository.save(car);
    }
    @PatchMapping("/PatchCar/{id}")
    public Car updateCar(@RequestBody Car car) {
        return carRepository.save(car);
    }
    @DeleteMapping("/RemoveCar/{id}")
    public void deleteCar(@PathVariable("id") long id) {
        carRepository.deleteById(id);
    }


}
