package wypozyczalniaaut.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import wypozyczalniaaut.entities.Car;

public interface CarsRepository extends JpaRepository<Car, Long> {

}
