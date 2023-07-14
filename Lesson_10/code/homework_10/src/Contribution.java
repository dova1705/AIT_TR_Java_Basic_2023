import java.util.Scanner;

public class Contribution {
    public static void main(String[] args) {
        //В сберкассу на трёхпроцентный вклад положили S рублей. Какой станет сумма вклада через N лет?
        // ПГ = СВ * 3 / 100
        //ПГ - проценты годовых
        //СВ - сумма вклада.
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите ваш вклад: "); //приглашение пользавателю
        double sum = sc.nextDouble(); //читаем строку
        System.out.println("на сколько лет хотите вклад"); //приглашение пользавателю
        int years = sc.nextInt(); //читаем строку
        double result = 0;//параметр (счетчик) while

        while (0 < years) {
            result = result + (sum * 0.03);
            years --;
        }//end of while
        System.out.println(result);
    } //end of main
}//end of class
