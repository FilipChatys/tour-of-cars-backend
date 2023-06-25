package wypozyczalniaaut.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    @Column(name = "NAME")
    private String name;
    @Column(name = "MARK_OF_CAR")
    private String markOfCar;
    @Column(name = "MODEL_OF_CAR")
    private String modelOfCar;
    @Column(name = "SEGMENT")
    private String segment;
    @Column(name = "IMG_SRC_OF_CAR")
    private String imgSrcOfCar;
    @Column(name = "TYPE_OF_FUEL")
    private String typeOfFuel;
    @Column(name = "CLIMATRONIC")
    private boolean climatronic;
    @Column(name = "ELECTRIC_SHIELD")
    private boolean electricShield;
    @Column(name = "ELECTRIC_MIRRORS")
    private boolean electricMirrors;
    @Column(name = "STATIONARY_COMPUTER")
    private boolean stationaryComputer;
    @Column(name = "AUTOMATIC_DOOR_CLOSE")
    private boolean automaticDoorClose;
    @Column(name = "CAPACITY_OF_ENGINE")
    private String capacityOfEngine;
    @Column(name = "HORSE_POWER")
    private String horsePower;
    @Column(name = "FUEL_BURN_IN_CITY")
    private String fuelBurnInCity;
    @Column(name = "FUEL_BURN_ON_ROAD")
    private String fuelBurnOnRoad;
    @Column(name = "AMOUNT_OF_DOORS")
    private int amountOfDoors;
    @Column(name = "AMOUNT_OF_AIR_BAGS")
    private int amountOfAirBags;
    @Column(name = "ABS")
    private boolean abs;

}