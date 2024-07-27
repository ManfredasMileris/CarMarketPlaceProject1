package com.ironhack.carmarketplaceproject1.controller;

import com.ironhack.carmarketplaceproject1.model.Car;
import com.ironhack.carmarketplaceproject1.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarRepository carRepository;
    @GetMapping
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
//    @GetMapping("/{id}")
//    public Car getCarById(@PathVariable("id") long id) {
//        return carRepository.findById(id).orElse(null);
//    }
//    @GetMapping("/carsByPrice")
//    public List<Car> getCarsByPrice(@RequestParam int minPrice, @RequestParam int maxPrice) {
//        return carRepository.findByPriceBetween(minPrice, maxPrice);
//    }
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
