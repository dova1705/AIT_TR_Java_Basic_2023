package practice_33.city;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    //вызвать тестируемый класс
    City[] city;
    @BeforeEach
    void setUp() {
        //создать тестовый набор данных
        city = new City[10];//создаем массив
        city[0] = new City("Berlin", 3645000, 60, "13555");
        city[1] = new City("Munchen", 1545000, 45, "85555");
        city[2] = new City("Bamberg", 400000, 35, "96138");
        city[3] = new City("Augsburg", 360000, 65, "86356");
        city[4] = new City("Hennef", 46114, 30, "53773");
        city[5] = new City("New York", 8800000, 80, "10001");
        city[6] = new City("Moscow", 15000000, 70, "1410000");
        city[7] = new City("Moscow", 150000, 60, "10005");
        city[8] = new City("Berlin", 36000, 50, "10009");
        city[9] = new City("Moscow", 15000000, 30, "1410000");

    }

    @Test
    void testSort (){
        System.out.println("======================Array as is======================");
        printArray(city);
        Arrays.sort(city);
        System.out.println("======================Array sorted======================");
        printArray(city);
    }

    @Test
    void testSortComparator (){
        System.out.println("======================Array as is======================");
        printArray(city);
        Comparator<City> cityComparator = new Comparator<City>() {//компаратор он определяет способ сортировки
            @Override
            public int compare(City o1, City o2) {
                int compareName = o1.getName().compareTo(o2.getName());//сортировка по алфавиту
                int comparePopulation =  -(o1.getPopulation() - o2.getPopulation()); //по размеру популяции
                if (compareName != 0){
                    return compareName;
                } else if (comparePopulation != 0){
                    return comparePopulation; //по размеру популяции
                }else {
                    return o1.getPollution() - o2.getPollution();//по загрязнению меньше значения - выше
                }
            }
        };

        Arrays.sort(city, cityComparator);//выбираем другой метод класса Arrays
        System.out.println("======================Array sorted======================");
        printArray(city);
    }
    static void printArray(Object[] arr){
        for (Object name : arr) {
            System.out.println(name);
        }
    }
}