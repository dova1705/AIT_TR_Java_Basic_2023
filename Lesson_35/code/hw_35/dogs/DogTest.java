package hw_35.dogs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    // вызвать тестируемый класс
    Dog[] dogs; //много собак (массив типа Dog)

    @BeforeEach
    void setUp() {
        // создать тестовый набор данных

        dogs = new Dog[5]; // создаем массив
        dogs[0] = new Dog(100, "Mukhtar", 5);
        dogs[1] = new Dog(101, "Recs", 3);
        dogs[2] = new Dog(102, "Sharik", 1);
        dogs[3] = new Dog(103, "Bobik", 6);
        dogs[4] = new Dog(104, "Layka", 7);

        // или так
        // dogs = new Dog[] {
        //        new Dog(100, "Mukhtar", 5),
        //        new Dog(101, "Recs", 3),
        //        new Dog(102, "Sharik", 1),
        //        ....
        // };

    }

    //метод для печати массива
    public void printArray(Object[] arr, String title) {
        System.out.println("==============" + title + "==============");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    void binarySearchTest() {
        // бинарный поиск работает ТОЛЬКО с ОТСОРТИРОВАННЫМ МАССИВОМ
        printArray(dogs, "Несортированный массив собак");
       // Arrays.sort(dogs);//Сортировка по убыванию. Метод написан в классе Dog compareTo
        Comparator<Dog> dogComparator = Comparator.comparing(Dog :: getAge); // сортировка компаратором по весу, на вход подаем какой класс сортируем после двоеточие :: пишем по какому критерию сортируем (возраст, имя, иес id ....)
        Arrays.sort(dogs, dogComparator);// выполнили сортировку
        printArray(dogs, "Сортированный массив собак");

        //теперь можно применять BinarySearch
        Dog pattern = new Dog(102);//поиск BinarySearch существующего элемента
        int index = Arrays.binarySearch(dogs, pattern);
        System.out.println("индекс искомого объекта: " + index);//ожидаем индекс 0
    }

    //сортировку по имени (по алфавиту), сделаем с помощью Comparator

    @Test
    void searchByComparatorTest() {
        printArray(dogs, "Несортированный массив собак");
        Comparator<Dog> dogComparator = new Comparator<Dog>() {//объявление компаратора
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getName().compareTo(o2.getName()); //сравнение по имени
            }
        };
        Arrays.sort(dogs, dogComparator); // выполнили сортировку
        printArray(dogs, "Сортированный по имени массив собак");

        Dog pattern = new Dog(100, "Mukhtar", 5);
        int index = Arrays.binarySearch(dogs, pattern, dogComparator);//поиск по имени (63- троке dogComparator для чего??)
        System.out.println("индекс: " + index); //ожидаем 2
    }

    @Test
    void ArrayCopyTest() {
        printArray(dogs, "Несортированный массив собак");
        Dog[] dogsCopy = Arrays.copyOf(dogs, 6);//копия массива на вход откуда копируем и длина
        printArray(dogsCopy, "Скопированный массив");
        //массив с null внутри не сортируется стандартным образом

        Comparator<Dog> dogComparator = (d1, d2) -> d1.getName().compareTo(d2.getName());//сравнение по имени (лямбда)
        Arrays.sort(dogsCopy, 0, dogs.length, dogComparator);
        printArray(dogsCopy, "Сортированная копия массива собак");
        //сортировать можно только без null ту часть массива, где их нет
    }

}