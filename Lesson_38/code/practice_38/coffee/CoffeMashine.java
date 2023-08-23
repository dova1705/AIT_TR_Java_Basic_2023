package practice_38.coffee;

import practice_38.seasons.Season;

import java.util.Scanner;

public class CoffeMashine {
    public static void main(String[] args) {

        System.out.println("Welcome to our Coffee Shop!");

        //предложить меню
        Coffee[] menu = Coffee.values();// в массив положили все 4 сезонов. values(): возвращает массив из всех хранящихся в Enum значений
        for (int i = 0; i < menu.length; i++) {//цикл
            System.out.println((i + 1) + " - " + menu[i]); //печать массива
        }
        //понять выбор пользователя
        System.out.println("input number of your choice: ");//приглашение пользователю
        Scanner sc = new Scanner(System.in);//включили сканер
        int choice = sc.nextInt();//слушаем пользователя
        switch (choice) {
            case 1, 2, 3, 4, 5: {
                System.out.println("Your choice is: " + menu[choice - 1].name());
                System.out.println("The volume is: " + menu[choice - 1].getVolume() + " ml");
                System.out.println("The price is: " + menu[choice - 1].getPrice() + " euro");
                break;
            }
            default: {
                System.out.println("Wrong choice");
            }
        }
        //объявить цену и предложить оплатить


    }
}
