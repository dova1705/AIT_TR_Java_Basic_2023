import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // включение Scanner

        //Задача 2
        //Запросить у пользователя длину радиуса окружности. Написать метод, который
        // находит площадь круга для введенного радиуса. Вычислить площадь круга, вызвав
        // написанный метод. S = π × r 2

        System.out.println("Введите длину радиуса:"); //сообщение пользователю
        double radius = sc.nextDouble(); //читаем строку
        System.out.println("радиус: " + radius);// печатаем строку
        double sq = square(radius); //вызов метода
        System.out.printf("площадь круга равен: %.4f", sq);

    }

        public static double square(double r) {
        double s = Math.PI * r * r;
        return s;
    }
}

//Извините что с опозданием я 2 дня мучался над методом)).


