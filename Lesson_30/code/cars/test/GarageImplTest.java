package cars.test;

import cars.dao.Garage;
import cars.dao.GarageImpl;
import cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    Garage garage; //создали объект класса Company
    Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("MR 2946 E", "VAZ 2109", "Taxi Yandex", 1.9, "белый");
        cars[1] = new Car("MR 1705 D", "Priora", "Taxi Uber", 1.9, "зелёный");
        cars[2] = new Car("MR 0707 A", "VAZ 2107", "Taxi Maxim", 1.9, "красный");

        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }

    }

    @Test
    void addCar() {
        assertEquals(3, garage.size());
        Car car = new Car("MR 1705 D", "Priora", "Taxi Uber", 1.9, "зелёный");
        assertTrue(garage.addCar(car));
        assertEquals(4, garage.size());

    }

    @Test
    void removeCar() {
        System.out.println(garage.size());
        assertEquals(cars[2], garage.removeCar("MR 0707 A"));
        System.out.println(garage.size());
    }

    @Test
    void findCarsByRegNumber() {
    }

    @Test
    void findCarsByModel() {
    }

    @Test
    void findCarsByCompany() {
    }
}