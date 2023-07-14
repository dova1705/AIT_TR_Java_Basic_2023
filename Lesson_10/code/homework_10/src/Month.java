import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        //Написать программу, которая принимает с клавиатуры номер месяца и год и выводит на экран
        // название месяца и количество дней в нем. (повторение условного оператора)

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            case 2:
                System.out.println("Февраль");
            case 4:
                System.out.println("Апрель");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            default:
                System.out.println("не правильно ввели число месяца");
        }
    }
}
