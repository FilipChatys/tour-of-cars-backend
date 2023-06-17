CREATE TABLE Cars
(
    id                   int NOT NULL AUTO_INCREMENT,
    shown_name           varchar,
    mark_of_car          varchar,
    model_of_car         varchar,
    segment              varchar,
    img_src_of_car       varchar,
    type_of_fuel         varchar,
    climatronic          boolean,
    electric_shield      boolean,
    electric_mirrors     boolean,
    stationary_computer  boolean,
    automatic_door_close boolean,
    capacity_of_engine   varchar,
    horse_power          varchar,
    fuel_burn_in_city    varchar,
    fuel_burn_on_road    varchar,
    amount_of_doors      int,
    amount_of_air_bags   int,
    abs                  boolean,
    PRIMARY KEY (ID)
);