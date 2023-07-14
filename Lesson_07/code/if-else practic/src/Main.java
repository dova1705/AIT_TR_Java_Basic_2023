import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("If - else practice");
        //Задание 1:
        // Проверка четное или нечетное, положительное или отрицательное введенное пользователем число.
        // Проверка возраста собеседника, возраст запросить у пользователя. Если пользователю нет 18 лет,
        // то сообщить "Вам надо получить общее среднее образование", иначе - спросить дату дня рождения и
        // вывести ее на экран.

        Scanner scanner = new Scanner(System.in); // включение сканера

        System.out.println("Input number, pls: "); //приглашение пользователю
        int number = scanner.nextInt();

        if (number % 2 == 0) { //Проверка четное или нечетное введенное пользователем число.
            System.out.println("This is number " + number + " is even."); //сообшение для пользователя
        } else {
            System.out.println("This is number " + number + " is odd."); //сообшение для пользователя
        }

        if (number > 0) {//Проверка положительное или отрицательное введенное пользователем число.
            System.out.println("This is number " + number + " is positive."); //сообшение для пользователя
        } else {
            System.out.println("This is number " + number + " is negative."); //сообшение для пользователя
        }

        //четное и положительное число
        if (number > 0 & number % 2 == 0) {//Проверка положительное и четное введенное пользователем число.
            System.out.println("This is number " + number + " is positive even and."); //сообшение для пользователя
        }

        System.out.println("How old are you?"); //вопрос для пользователя
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Вам надо получить общее среднее образование"); //сообшение для пользователя
        } else {
            System.out.println("Ваш год рождение?"); //вопрос для пользователя
            String birthday = scanner.next();
            System.out.println("Ваша год рождение: " + birthday); //сообшение для пользователя
        }



    }
}