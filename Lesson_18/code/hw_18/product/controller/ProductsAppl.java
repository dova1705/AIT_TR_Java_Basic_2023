package hw_18.product.controller;

import hw_18.product.model.Product;
import hw_18.product.model.Food;
import hw_18.product.model.MeatFood;
import hw_18.product.model.MilkFood;

public class ProductsAppl {
    public static void main(String[] args) {
        Product prod1 = new Product(1, "ананас",  482002470001L);
        Product prod2 = new Food(2, "авакадо",  482002470001L, false);
        Product prod3 = new MilkFood(1.2, "Простоквашино", 482002470001L, true, "пастеризованное", 3.2);
        Product prod4 = new MilkFood(1.2, "Савушкин продукт", 321024700016L, true, "не пастеризованное", 3.2);
        Product prod5 = new MeatFood(3.5, "Здоровая ферма", 321024700016L, false, "баранина");

        Product[] arrOfProducts = new Product[5];
        arrOfProducts[0] = prod1;
        arrOfProducts[1] = prod2;
        arrOfProducts[2] = prod3;
        arrOfProducts[3] = prod4;
        arrOfProducts[4] = prod5;

        printArr(arrOfProducts); // вызов метода, печатаем массив объектов
        System.out.println("Сумма цен продуктов: " + sumProducts(arrOfProducts));// вычесляем сумму продуктов
        System.out.println("сравнение продуктов по штрих коду " + prod1.equals(prod2));
        System.out.println("сравнение продуктов по штрих коду " + prod3.equals(prod4 ));
    }

    //---------Методы-----------
    //печатаем массив
    public static void printArr (Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
    public static double sumProducts (Product[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getPrice();
        }
        return sum;
    }

}
