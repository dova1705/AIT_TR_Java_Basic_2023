package practice_38.coffee;

import java.util.Scanner;

public class CoffeMashine {
    public static void main(String[] args) {
        System.out.println("Welcome to our Coffee Shop!");

        //предложить меню (печать меню)
        Coffe[] menu = Coffe.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " - " + menu[i]);
        }

        //понять выбор пользователя
        System.out.println("Input number of your choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
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

        //объявить цену и предложить оплату
    }

}
