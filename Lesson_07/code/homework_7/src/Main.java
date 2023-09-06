import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1.
        //Запросить у пользователя три стороны треугольника. Проверить выполнимость
        // неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
        // Сообщить результат пользователю - существует или нет треугольник с введенными сторонами

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 1-st side of the triangle:"); // приглашение пользователя
        double a = scanner.nextDouble();
        System.out.println("enter the 2-nd side of the triangle:"); // приглашение пользователя
        double b = scanner.nextDouble();
        System.out.println("enter the 3-rd side of the triangle:"); // приглашение пользователя
        double c = scanner.nextDouble();

        if ((a < b + c) && (b < a + c) && (c < a + b)){
            System.out.println("трехугольник существует с введенными сторонами " + a + ", " + b + ", " + c);
        } else {
            System.out.println("трехугольник не существует с введенными сторонами " + a + ", " + b + ", " + c);
        }

        scanner.close(); // закрытие сканера
    }
}