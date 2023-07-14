import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //Задача 2
        //Дополнить задачу о сумме углов треугольника контролем, что вводимые углы не больше 90 градусов.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 1-st side of the triangle:"); // приглашение пользователя
        double a = scanner.nextDouble();
        System.out.println("enter the 2-nd side of the triangle:"); // приглашение пользователя
        double b = scanner.nextDouble();
        System.out.println("enter the 3-rd side of the triangle:"); // приглашение пользователя
        double c = scanner.nextDouble();

        if (a * a == (b * b) + (c * c)){
            System.out.println("Прямоугольный треугольник");
        } else {
            System.out.println("Не прямоугольный треугольник");
        }

        scanner.close(); // закрытие сканера
    }
}