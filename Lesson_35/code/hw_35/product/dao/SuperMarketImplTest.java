package hw_35.product.dao;

import hw_35.product.model.Computer;
import hw_35.product.model.Food;
import hw_35.product.model.Furniture;
import hw_35.product.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SuperMarketImplTest {

    //поля класса
    SuperMarketImpl superMarket; //поле, подключение тестируемого класса, создание объектной переменной
    Product[] products; //поле типа Product, это массив, пока он получил только название


    @BeforeEach
    void setUp() {
        superMarket = new SuperMarketImpl(10);//вызов конструктора
        products = new Product[6];
        products[0] = new Computer(100,"HP",355.5,"Intel(R) Pentium(R)",8);
        products[1] = new Computer(101,"Acer",450.0,"Intel-i3",16);
        products[2] = new Food(200,"Простоквашино",1.20,"кефир");
        products[3] = new Food(201,"Старый рецепт",1.50,"ряженка");
        products[4] = new Furniture(300,"Пинскдрев",50.0,"кресло");
        products[5] = new Furniture(301,"Икеа",20.0,"табуретка");
        //или products = new Product[]{
        //                          new Computer(100,"Lenovo",255.5,"Intel(R) Pentium(R)",8),
        //                          new Furniture(300,"Пинскдрев",50.0,"кресло"),
        //                          new Food(200,"Простоквашино",1.20,"кефир"),
        //        };

        for (int i = 0; i < products.length; i++) {// перебираем весь массив
            superMarket.add(products[i]); //добавляет продукта
        }

    }

    @Test
    void add() {
        System.out.println("Количество продукта до добавления : " + superMarket.size()); //печать количество продукта
        superMarket.printProduct();//печать продукта
        //для того что-бы добавить нужно создать
        Computer computer = new Computer(102,"Dell",500.0,"AMD EPYC 9474F",16);
        assertTrue(superMarket.add(computer)); //проверяем добавился ли новый продукт
        Furniture furniture = new Furniture(302,"Биомебель",40.0,"стол");
        assertTrue(superMarket.add(furniture)); //проверяем добавился ли новый продукт
        assertFalse(superMarket.add(null)); //тест на добавление null (нельзя добавить null)
        assertEquals(8,superMarket.size()); //проверка size (количество работников)
        System.out.println("Количество продукта после добавления : " + superMarket.size()); //печать количество продукта
        superMarket.printProduct();//печать продукта добавленного
    }

    @Test
    void remove() {
        System.out.println("Количество продукта до удаления : " + superMarket.size()); //печать количество продукта
        assertEquals(products[3], superMarket.remove(201)); //тест на удаление продукта (assertEquals сравнение объекта с объектом)
        assertEquals(5,superMarket.size()); //проверка size (количество продукта)
        System.out.println("Количество продукта после удаления : " + superMarket.size());
        assertEquals(products[1], superMarket.remove(101));//тест на удаление продукта (assertEquals сравнение объекта с объектом)
        assertEquals(4,superMarket.size()); //проверка size (количество продукта)
        System.out.println("Количество продукта после удаления : " + superMarket.size());
        superMarket.printProduct();

    }

    @Test
    void search() {
        superMarket.printProduct();
        assertEquals(products[5], superMarket.search(301));//тест на поиск продукта (assertEquals сравнение объекта с объектом)
        System.out.println(superMarket.search(301));//печать искомого объекта
    }

    @Test
    void totalSumOfPrice() {
        assertEquals(878.2,superMarket.totalSumOfPrice(products));//тест на вычисление сумму (assertEquals сравнение double с методом totalSumOfPrice класса superMarket, метод возвращает double)
        System.out.println("Сумма: " + superMarket.totalSumOfPrice(products));
        Computer computer = new Computer(105,"Toshiba",500.0,"AMD EPYC 9274F", 8);//новый продукт
        assertTrue(superMarket.add(computer)); //проверяем добавился ли новый продукт
        assertEquals(7,superMarket.size()); //проверка size (количество продукта)
        superMarket.printProduct();

       // assertEquals(1378.2, superMarket.totalSumOfPrice(products));//???
        System.out.println("Сумма: " + superMarket.totalSumOfPrice(products));


    }

    @Test
    void averagePrice() {
        assertEquals(146.36666666666667,superMarket.averagePrice(products));
        System.out.println(superMarket.averagePrice(products));
    }

    @Test
    void size() {
        superMarket.printProduct();
        assertEquals(6,superMarket.size()); //проверка size (количество продукта)
        Food food = new Food(202,"Borjomi", 0.50,"минеральная вода");
        assertTrue(superMarket.add(food));  //проверяем добавился ли новый продукт
        assertEquals(7,superMarket.size());//проверка size (количество продукта)
        superMarket.printProduct();

    }

    @Test
    void printProduct() {
    }

    //сортировка по полю price
    @Test
    void sortByPriceTest(){
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());//сравнение по полю price
            }
        };
        superMarket.printProductArr(products);//печать списка работников до сортировки
        Arrays.sort(products,productComparator); //Сортировка на вход подаем массив и comparator. Класс Arrays метод sort
        superMarket.printProductArr(products); //печать списка работников после сортировки
    }

    //сортировка по полю id
    @Test
    void sortByIdTest(){
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return -(o1.getId() - o2.getId());//сравнение по полю id
            }
        };
        superMarket.printProductArr(products);
        Arrays.sort(products, productComparator);//Сортировка на вход подаем массив и comparator. Класс Arrays метод sort
        superMarket.printProductArr(products);
    }

    //сортировка по полю brand
    @Test
    void sortByBrandTest(){
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getBrand().compareTo(o2.getBrand());//сравнение по полю brand
            }
        };
        superMarket.printProductArr(products);
        Arrays.sort(products,productComparator);//Сортировка на вход подаем массив и comparator. Класс Arrays метод sort
        superMarket.printProductArr(products);
    }
}