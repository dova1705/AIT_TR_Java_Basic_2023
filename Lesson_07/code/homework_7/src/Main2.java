import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Задача 3
        //Сделайте расчет покупки товаров со скидками. Стоимость, количество товаров и скидку на них вводит пользователь.
        //Товар А стоит X руб и на него скидка D%, а товар B стоит Y руб и на него скидка С%. Клиент взял N товаров A и M товаров B.
        //Программа не должна допускать ввода отрицательных чисел. Выведите итоговую стоимость покупки и полученной скидки.

        Scanner scanner = new Scanner(System.in);
        System.out.println("product price A:"); // приглашение пользователя
        double priceA = scanner.nextDouble();
        System.out.println("number of products:"); // приглашение пользователя
        double quantityA = scanner.nextDouble();
        System.out.println("discount of products:"); // приглашение пользователя
        double discountA = scanner.nextDouble();

        double totalCostA = priceA * quantityA;
        System.out.println("Итоговая стоимость товара А: " + totalCostA);
        double aDiscount = (priceA * quantityA) / quantityA * 100;
        System.out.println("Скидка на товар А: " + aDiscount);

        System.out.println("product price B:"); // приглашение пользователя
        double priceB = scanner.nextDouble();
        System.out.println("number of products:"); // приглашение пользователя
        double quantityB = scanner.nextDouble();
        System.out.println("discount of products:"); // приглашение пользователя
        double discountB = scanner.nextDouble();

        double totalCostB = priceB * quantityB;
        System.out.println("Итоговая стоимость товара А: " + totalCostB);
        double bDiscount = (priceB * quantityB) / quantityB * 100;
        System.out.println("Скидка на товар B: " + bDiscount);




        scanner.close(); // закрытие сканера
    }
}