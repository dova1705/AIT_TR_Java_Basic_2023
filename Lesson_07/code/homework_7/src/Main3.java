import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //Задача 4
        //Написать программу, определяющую является ли год високосным. Для того, чтобы быть високосным год должен: делится без остатка
        //на 4 и либо не должен делится без остатка на 100 либо если он делится на 100, то он должен делится также на 400.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:"); // приглашение пользователя
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0) {
            System.out.println("Указанный год високосный");
        } else {
            System.out.println("Указанный год не високосный");
        }

        scanner.close(); // закрытие сканера
    }
}
