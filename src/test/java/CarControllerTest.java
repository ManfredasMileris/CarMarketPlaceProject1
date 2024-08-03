import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ironhack.carmarketplaceproject1.controller.CarController;
import com.ironhack.carmarketplaceproject1.enums.CarStatus;
import com.ironhack.carmarketplaceproject1.model.Car;
import com.ironhack.carmarketplaceproject1.repository.CarRepository;
import com.ironhack.carmarketplaceproject1.service.CarService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CarControllerTest {

    @InjectMocks
    private CarController carController;

    @Mock
    private CarRepository carRepository;

    @Mock
    private CarService carService;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("M3", "BMW", 2019, 55000, CarStatus.USED));
        when(carRepository.findAll()).thenReturn(cars);

        List<Car> result = carController.getAllCars();

        assertEquals(1, result.size());
    }



    @Test
    void testAddCar() {
        Car car = new Car("M3", "BMW", 2019, 55000, CarStatus.USED);
        when(carRepository.save(car)).thenReturn(car);

        Car result = carController.addCar(1, car);

        assertEquals("BMW", result.getBrand());
    }
    @Test
    void testFindByYear() {
        int year = 2021;
        List<Car> carsByYear = new ArrayList<>();
        carsByYear.add(new Car("A6", "Audi", 2024, 70000, CarStatus.NEW));
        carsByYear.add(new Car("M5 Competition", "BMW", 2019, 70000, CarStatus.USED));

        when(carService.findByYear(year)).thenReturn(carsByYear);

        List<Car> result = carController.findByYear(year);

        assertEquals(2, result.size());
        assertEquals("Audi", result.get(0).getBrand());
        assertEquals("BMW", result.get(1).getBrand());
    }



}