package practice_32.cat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat[] cats; //массив из объектов типа Cat





    @BeforeEach
    void setUp() {
        cats = new Cat[]{
                new Cat("Murzik", 5, "black", 4.8),
                new Cat("Garfild", 12, "grey", 6.0),
                new Cat("Lucy", 3, "white", 4.5),
                new Cat("Ponchik", 6, "red", 6.5)
        };
    }

    @Test
    void catSortAgeTest(){
        System.out.println("=================== Cats unsorted ===================");
        printArray(cats);
        Arrays.sort(cats);//подвергаем сортировке
        System.out.println();
        System.out.println("=================== Cats sorted by ages ===================");
        printArray(cats);//вызов метода printArray


    }
    @Test
    void catSortNameTest(){
        System.out.println("=================== Cats unsorted ===================");
        printArray(cats);
        Arrays.sort(cats);//подвергаем сортировке
        System.out.println();
        System.out.println("=================== Cats sorted by name ===================");
        printArray(cats);//вызов метода printArray
    }

    @Test
    void catSortComporator(){
        System.out.println("=================== Cats unsorted ===================");
        printArray(cats);
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Arrays.sort(cats, catComparator); //сортировка с помощью catComporator
        System.out.println("=================== Cats sorted by age ===================");
        printArray(cats);//вызов метода printArray
    }

    @Test
    void catSortNameAndAgeTest(){
        System.out.println("=================== Cats unsorted ===================");
        printArray(cats);
        Arrays.sort(cats);//подвергаем сортировке
        System.out.println();
        System.out.println("=================== Cats sorted by name and age ===================");
        printArray(cats);//вызов метода printArray


    }

    //_____________________Methods__________________
    public void printArray (Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}