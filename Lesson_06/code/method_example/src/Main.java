import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // включение Scanner

        //Задача 3
        //Даны строки разной длины (длина - четное число), необходимо вернуть два средних знака этой строки.
        // Например, если дана строка "string" результат будет "ri", для строки "code" результат "od" для
        // "Practice" результат "ct".

        System.out.println("введите текст");
        String one = sc.next();//читаем строку
        int longs = one.length();//узнаем длину
        String average = one.substring(longs / 2 - 1, longs / 2 + 1);
        System.out.println("два средних знака: " + average); //печатаем результат



    }
}