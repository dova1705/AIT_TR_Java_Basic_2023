package hw_22;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        // Одноклеточная амёба каждые 3 часа делится на 2 такие же амёбы. Необходимо определить,
        // сколько будет амёб через n часов, если первоначально была только одна амёба.

        //код посмотрел в интернете
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        int x = sc.nextInt();
        int res = 1;
        for (int i = 0; i < x / 3; i++) {
            res *= 2;
        }
        System.out.println("За " + x + " часов получится " + res + " амеб");
    }
}
