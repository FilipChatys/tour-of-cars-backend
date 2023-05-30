package wypozyczalniaaut.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wypozyczalniaaut.entities.Car;
import wypozyczalniaaut.repositories.CarsRepository;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CarController {

    @Autowired
    CarsRepository carsRepository;

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllCars() {
        try {
            List<Car> cars = new ArrayList<Car>();

            carsRepository.findAll().forEach(cars::add);

            if (cars.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(cars, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
