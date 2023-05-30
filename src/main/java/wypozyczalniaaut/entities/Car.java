package wypozyczalniaaut.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;
import static wypozyczalniaaut.Application.getCars;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Cars")
public class Car {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String carPlate;
    @Column
    private String mark;
    @Column
    private String model;
    @Column
    private int seats;
    @Column
    private BigDecimal price;

    public Car(String carPlate, String mark, String model, int seats, BigDecimal price) {

        this.carPlate = carPlate;
        this.mark = mark;
        this.model = model;
        this.seats = seats;
        this.price = price;
    }

    /**
     * @param mark
     * @return lista pojazdów ograniczonych do danego modelu
     */

    public static List<Car> getListOfCars(String mark) {

        //TODO
        //do zrobienia implementacja która pozwoli na ograniczenie listy do składającej się z danej marki
        List<Car> allCars = getCars();
        List<Car> matchingCars = new ArrayList<>();

        for (Car car : allCars) {
            if (car.getMark().equalsIgnoreCase(mark)) {
                matchingCars.add(car);
            }
        }

        return matchingCars;
    }

        //return Collections.emptyList();
    //}

    public static List<Car> getListOfCars(String mark, String model) {

        //TODO
        //do zrobienia implementacja która pozwoli na ograniczenie listy do składającej się z danej marki oraz modelu

        List<Car> filteredCars2 = new ArrayList<>();

        for (Car car : getCars()) {
            if (car.getMark().equals(mark) && car.getModel().equals(model)) {
                filteredCars2.add(car);
            }
        }

        return filteredCars2;
    }

}