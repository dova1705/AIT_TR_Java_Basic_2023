
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ");
        Scanner sc = new Scanner(System.in); // включение Scanner

        //Задача 1
        //Вычислите гипотенузу по двум катетам. Длину катетов запросите у пользователя.
        // Теорема Пифагора. Math.sqrt();

        System.out.println("введите ссторону треугольника а: "); //приглашение пользавателю
        int aSide = sc.nextInt();
        System.out.println("сторона А - равна " + aSide);

        System.out.println("введите ссторону треугольника b: "); //приглашение пользавателю
        int bSide = sc.nextInt();
        System.out.println("сторона B - равна " + bSide);

        double hypotenuse = (double)Math.sqrt(aSide * aSide + bSide * bSide);
        System.out.println("Гипотенуза равна: " + hypotenuse);

        //Задача 2
        //Написать программу для перевода градусов по Фаренгейту в шкалу Цельсия.
        // Формула для перевода С = 5*(F-32)/9. Запросить у пользователя темпаратуру.

        System.out.println("перевод градусов по Фаренгейту в шкалу Цельсия");

        System.out.println("Введите градус по Фаренгейту: ");
        double farangate = sc.nextDouble(); // читаем строку
        double celsius = 5 * (farangate - 32) / 9; //
        System.out.println("По шкале Цельсия: " + celsius);


        System.out.println("Введите градус по Цельсия : ");
        double celsius1 = sc.nextByte();// читаем строку
        double farangate1 = celsius1 * 1.8 + 32;
        System.out.println("по Фаренгейту: " + farangate1);

        //Задача 3
        // Вычислите площадь треугольника по формуле Герона: p = (a + b + с)/2; S = sqrt(p*(p-a)(p-b)(p-c));

        System.out.println("Вычесляем площадь трехугольника по формуле Герона:");
        System.out.println("Введите сторону а: "); // приглашение пользователю
        double sideA = sc.nextDouble(); // читаем строку

        System.out.println("Введите сторону b: "); // приглашение пользователю
        double sideB = sc.nextDouble(); // читаем строку

        System.out.println("Введите сторону c: "); // приглашение пользователю
        double sideC = sc.nextDouble(); // читаем строку

        double p = (sideA + sideB + sideC) / 2; // периметр возможно я ошибаюсь
        System.out.println("периметр трехугольника: " + p);

        double s =  Math.sqrt(p *(p - sideA) * (p - sideB) * (p - sideC));
        System.out.println("площадь трехугольника: "+ s);


        sc.close(); // закрытие сканера


    }
}