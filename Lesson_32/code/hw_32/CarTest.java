package hw_32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car[] cars;

    @BeforeEach
    void setUp() {
        cars = new Car[6];
        cars[0] = new Car("MR2946E", "Toyota", "доставка еды", 2.0, "белый", 100000);
        cars[1] = new Car("AG3412F", "Nissan", "Taxi Uber", 1.8, "жёлтый", 200000);
        cars[2] = new Car("DZ5780G", "Audi", "аренда авто", 2.5, "черный", 90000);
        cars[3] = new Car("BL8812S", "BMW", "Taxi", 3.0, "черный", 300000);
        cars[4] = new Car("LB9872K", "Lada", "курьер", 1.6, "серый", 400000);
        cars[5] = new Car("MR0707D", "Lada", "курьер", 1.6, "серый", 400001);
    }

    @Test
    void carsSortTest() {
        System.out.println("======================Unsorted======================");
        printArray(cars);
        System.out.println("======================Sorted======================");
        Arrays.sort(cars);
        printArray(cars);
    }

    // сортировка с помощью Comparator по одному полю engine
    @Test
    void carsSortByComparatorEngineTest() {
        System.out.println("======================Unsorted======================");
        printArray(cars);
        Comparator<Car> engineComporator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getEngine() - o2.getEngine() < 0) {
                    return -1;
                } else if (o1.getEngine() - o2.getEngine() == 0) {
                    return 0;
                } else {return 1;}
            }
        };
        System.out.println("=========Sorted=============");
        Arrays.sort(cars, engineComporator);
        printArray(cars);
    }
    // сортировка с помощью Comporator по одному полю model
    @Test
    void carsSortByComparatorModelTest() {
        System.out.println("==============================Unsorted==============================");
        printArray(cars);
        Comparator<Car> modelComporator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        };
        System.out.println("===============================Sorted===================================");
        Arrays.sort(cars, modelComporator);
        printArray(cars);
    }

    // сортировка с помощью Comporator по одному полю millage от большого к меньшему
    @Test
    void carsSortByComparatorMillageTest(){
        System.out.println("==============================Unsorted==============================");
        printArray(cars);
        Comparator<Car> millageComporator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return -(o1.getMillage() - o2.getMillage());
            }
        };
        System.out.println("===============================Sorted===================================");
        Arrays.sort(cars, millageComporator);
        printArray(cars);
    }
    // несколько полей для сортировки, одно после другого
    @Test
    void carsSortByConditionsTest(){
        System.out.println("==============================Unsorted==============================");
        printArray(cars);
        Comparator<Car> modelComporator2Fields = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int modelCompare = o1.getModel().compareTo(o2.getModel());// сортировка по модели
                if (modelCompare != 0){
                    return modelCompare;
                } else {
                    return -(o1.getMillage() - o2.getMillage()); // сортировка по пробегу от большего к меньшему
                }
            }
        };
        System.out.println("===============================Sorted===================================");
        Arrays.sort(cars, modelComporator2Fields);
        printArray(cars);
    }


    void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}