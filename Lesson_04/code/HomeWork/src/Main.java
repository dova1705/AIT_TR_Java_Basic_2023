import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson_4");
        Scanner sc = new Scanner(System.in); // включение Scanner

        //Задача 1.
        //Вычислите площадь квадрата и объем куба со стороной а. Значение a запросить у пользователя4

        System.out.println("введите сторону а: "); // приглашение пользователю
        int side = sc.nextInt();// читаем строку
        //int s = side * side; //вычисляем квадрат
        int s = (int) Math.pow(side, 2); // вычислил квадрат по другому
        System.out.println("Площадь квадрата равна: " + s);
        System.out.println("Площадь квадрата равна: " + (side * side));
        System.out.println("введите ребро а: "); // приглашение пользователю
        int edge = sc.nextInt(); // читаем строку
        System.out.println("Обьем куба равна: " + (edge * edge * edge));


        //Задача 2.
        // Напишите приложение, которое переводит радианы в градусы.
        System.out.println("Переводим радианы в градусы");
        System.out.println("введите радиан"); //приглашение пользователя
        double rad = sc.nextDouble(); //спрашиваем у пользователя
        double k = 57.296d; // этот коэффициент ищется в справочнике!!!
        double grad = rad * k;
        System.out.println("Получены данные в градусах " + grad);

        //Написать программу для вычисления средней стоимости поездки по-транспортному проездному.
        //Попросить пользователя ввести стоимость проездного на месяц
        //и количество рабочих дней в месяце. Считая, что в рабочий день в среднем две поездки,
        //и 1.5 поездки в выходной, посчитать и округлить общее число поездок в месяц
        //и посчитать среднюю стоимость одной поездки по-проездному.
        // Рассчитать для мая.


        System.out.println("Input cost of City ticket per Month: ");
        double priceMonatKarte = sc.nextDouble(); // считываем от пользователя стоимость проездного билета
        System.out.println("Input number of working das in current month: ");
        int workingDays = sc.nextInt();

        int trip = workingDays * 2; // количество поездок в рабочие дни
        int holydays = 31 - workingDays;

        int holydayTrip = (int)Math.round(1.5 * holydays); // количество поездок в выходные дни

        // trip = trip + holydayTrip; // так не очень хорошо, но можно
        int trips = 0; // общее количество поездок
        trips = trip + holydayTrip;

        System.out.println("Number of trips in May: " + trips);

        double averageTripPrice = priceMonatKarte/trips; // вычисляем среднюю стоимость

        System.out.println("Average price = " + averageTripPrice); // выводим на печать
        System.out.println();
        System.out.printf("Average price = %.2f", averageTripPrice); // выводим на печать
        System.out.println(); // переход на новую строку
        System.out.print("\n"); // переход на новую строку тоже
        System.out.println("This is new line");




        sc.close(); // закрытие сканера
    }
}