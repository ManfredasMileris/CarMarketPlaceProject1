package com.ironhack.carmarketplaceproject1.controller;

import com.ironhack.carmarketplaceproject1.model.Car;
import com.ironhack.carmarketplaceproject1.repository.CarRepository;
import com.ironhack.carmarketplaceproject1.service.CarService;
import lombok.RequiredArgsConstructor;
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
//    @GetMapping("/{id}")
//    public Car getCarById(@PathVariable("id") long id) {
//        return carRepository.findById(id).orElse(null);
//    }
    //@GetMapping("/price")
    //public List<Car> findCarsByPrice(@RequestParam("minPrice") double minPrice, @RequestParam("maxPrice") double maxPrice) {
   //     return carRepository.findByPriceBetween(minPrice, maxPrice);
   // }
    @GetMapping("/model/{model}")
    public List<Car> findByModel(@PathVariable("model") String model) {
        return carRepository.findByModel(model);
    }
    @GetMapping("/brand/{brand}")
    public List<Car> findByBrand(@PathVariable("brand")String brand) {
        return carRepository.findByBrand(brand);
    }
    @GetMapping("/year{year}")
    public List<Car> findByYear(@PathVariable("year")int year) {
        return carRepository.findByYear(year);
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
