package practice_19;
import java.util.Scanner;

public class IsPrime {
    //отсутствует поля, описывающие объекты
    //в нем есть методы
    //есть метод main, который исполняется

    public static void main(String[] args) {
        //Написать метод, определяющий, является ли число простым (primary).
        //Простое число - это число, которое делится только на себя и 1. Примеры: 2, 7, 11, 19, 47.

            //что на входе? - целое положительное число int n
            //Что на выход? - boolean, ответ на поставленный вопрос
            //ключевой алгоритм - перебрать все числа от 2 до (n-1) и проверить, разделилось ли число на любое из них
            // - если не произошло? Тогда это число n - простое, иначе оно НЕ простое


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input integer positive number: ");
            int n = sc.nextInt();

            if (primeN(n)) {
                System.out.println("Number " + n + " is prime.");
            } else {
                System.out.println("Number " + n + " is not prime.");
            }
            System.out.println("Continue? y/n ");
            String choice = sc.next();
            if (!choice.equals("y")){
                System.out.println("Thanks, bye!");
                break;
            }
        }

    }
    //---------methods-----------
    public static boolean primeN (int a) {
        boolean isPrime = true;
        System.out.println("n = " + a);
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {//если хотя-бы разделилось, то
                isPrime = false;//объявим что число НЕпростое и можно выйти из цикла

            }
        }
        return isPrime;

    }
}
