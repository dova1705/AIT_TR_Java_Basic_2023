package hw_24;

import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double D;
        System.out.println("Решение квадратного уравнения ax^2 + bx + c = 0");
        System.out.println("Введите а");
        a = sc.nextDouble();
        System.out.println("Введите b");
        b = sc.nextDouble();
        System.out.println("Введите c");
        c = sc.nextDouble();

        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: Х1= " + x1 + ", Х2 = " + x2);
        } else if (D == 0) {
            double x;
            x = - b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: X = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }



    }//end of method main
}//end of class
