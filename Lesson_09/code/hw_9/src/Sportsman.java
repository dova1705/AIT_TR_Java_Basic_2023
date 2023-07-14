import java.util.Scanner;
public class Sportsman {
    public static void main(String[] args) {
        // В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег
        // на 10 % от предыдущего значения. Определите номер дня, на который пробег спортсмена составит
        // не менее target километров. Программа получает на вход действительные числа s и target и должна
        // вывести одно натуральное число.
        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько км пробежал спортсмен в первый день? "); //вопрос пользавателю
        double s = sc.nextInt(); //читаем строку
        System.out.println("Сколько км он должен пробежать?"); //вопрос пользавателю
        int target = sc.nextInt();//читаем строку
        int day = 1;//параметр (счетчик)

        while (s < target){ // пока пробегаемая дистанция меньше, чем требуется
            s = s + s * 0.1; // можно и так писать distance *= 1.1
            day ++; // можно и так писать day = day + 1
        } //end of while
        System.out.println("за " + day + " дней пробежит " + target + "км");

    } //end of method main
} //end of class


