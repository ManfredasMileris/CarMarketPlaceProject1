package com.ironhack.carmarketplaceproject1.service;

import com.ironhack.carmarketplaceproject1.enums.CarStatus;
import com.ironhack.carmarketplaceproject1.model.Car;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ironhack.carmarketplaceproject1.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        log.info("getAllCars");
        return carRepository.findAll();
    }
    public List<Car>findByModel(String model) {
        log.info("getCarsByModel");
        return carRepository.findByModel(model);
    }
   public List<Car>findByBrand(String brand) {
        log.info("getCarsByBrand");
        return carRepository.findByBrand(brand);
   }
   //public List<Car>findByPrice(double price) {
  //      log.info("getCarsByPrice");
  //      return carRepository.findByPrice(price,price);
 //  }
    }


    //    public Optional<Car> getCarById(Long id) {
//        log.info("getCarById");
//        return carRepository.findById(id);
//    }


//    public List<Car>getCarByYear(int year) {
//        return carRepository.findByYear(year);
//    }


//    public List<Car>getCarByStatus(CarStatus status) {
//        log.info("getCarByStatus");
//        return carRepository.findByCondition(status);
//    }
//    @Transactional
//    public Car addCar(Car car){
//        log.info("Create car:{}",car);
//        return carRepository.save(car);
//    }


