package hw_19;

import java.util.Scanner;

public class IsPrimeM {
    public static void main(String[] args) {
        //Написать метод, определяющий, является ли число простым (primary).
        //Простое число - это число, которое делится только на себя и 1. Примеры: 2, 7, 11, 19, 47.

        //что на входе? - целое положительное число int n
        //Что на выход? - boolean, ответ на поставленный вопрос
        //ключевой алгоритм - перебрать все числа от 2 до (n-1) и проверить, разделилось ли число на любое из них
        // - если не произошло, Тогда это число n - простое, иначе оно НЕ простое


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input integer positive number: ");
            int n = sc.nextInt();
            System.out.println("n = " + n);
            if (primeN(n)) {
                System.out.println("Number " + n + " is prime.");
            } else {
                System.out.println("Number " + n + " is not prime.");
            }
        }
    }//end of method main

    //---------methods-----------
    public static boolean primeN (int a) {
        boolean isPrime = true;
        //System.out.println("n = " + a);
        for (int i = 2; i < a - 1; i++) {//для сокращения кол-во. циклов в место i < a - 1 можно написать i < Math.sqrt(a)
            if (a % i == 0) {//если хотя-бы разделилось, то
                isPrime = false;//объявим что число НЕ простое и можно выйти из цикла
            }
        }
        return isPrime;

    }//end of methods
}//end of Class
