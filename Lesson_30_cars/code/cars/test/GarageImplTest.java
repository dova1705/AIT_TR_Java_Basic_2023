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
        cars = new Car[4];//флот машин = 5 штук
        cars[0] = new Car("MR 2946 E", "VAZ 2109", "Taxi Yandex", 2.0, "белый");
        cars[1] = new Car("MR 1705 D", "Priora", "Taxi Uber", 1.9, "зелёный");
        cars[2] = new Car("MR 0707 A", "VAZ 2107", "Taxi Maxim", 1.8, "красный");
        cars[3] = new Car("MR 5946 0", "VAZ 2109", "Taxi Yandex", 2.0, "белый");

        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }

    }

    @Test
    void addCarTest() {
        assertFalse(garage.addCar(null));//добавить null нельзя
        assertEquals(4, garage.size());//размер гаража
        Car car = new Car("MR 1959 A", "Priora", "Taxi Uber", 2.2, "зелёный");
        assertTrue(garage.addCar(car));//добавляем еще одну машину
        assertEquals(5, garage.size());//проверка размера гаража
        car = new Car("MR 1957 S", "Mercedes", "Taxi", 2.2, "зелёный");
        assertFalse(garage.addCar(car));//не можем добавить авто сверх capacity


    }

    @Test
    void removeCarTest() {
        //System.out.println(garage.size());
        assertEquals(3,garage.size());//размер гаража
        assertEquals(cars[2], garage.removeCar("MR 0707 A"));//удалили авто по рег номеру
        assertEquals(2,garage.size());//размер гаража
        //System.out.println(garage.size());
    }

    @Test
    void findCarsByRegNumberTest() {
        assertEquals(cars[0], garage.findCarsByRegNumber("MR 2946 E"));
        assertEquals(null, garage.findCarsByRegNumber("MR 1705 Q"));

    }

    @Test
    void findCarsByModelTest() {
        Car[] expected = {cars[0], cars[3]};
        Car[] actual = garage.findCarsByModel("VAZ 2109");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompanyTest() {
        Car[] expected = {cars[0], cars[3]};
        Car[] actual = garage.findCarsByCompany("Taxi Yandex");
        assertArrayEquals(expected, actual);
    }
    @Test
    void findCarsByEngineTest() {
        //TODO
    }

    @Test
    void findCarsByColorTest(){
        Car[] expected = {cars[0], cars[3]};
        Car[] actual = garage.findCarsByColor("белый");
        assertArrayEquals(expected, actual);

    }
}