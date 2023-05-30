package wypozyczalniaaut.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wypozyczalniaaut.entities.Car;

public interface CarsRepository extends JpaRepository<Car, Long> {

}
