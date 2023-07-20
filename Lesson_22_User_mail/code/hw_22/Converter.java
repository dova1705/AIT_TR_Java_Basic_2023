package hw_22;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        // (switch case, бесконечный цикл, методы) Составьте программу для перевода мер длины:

        //саженей в метры (1 сажень равна 2,1366 м)
        //дюймов в сантиметры (1 дюйм равен 2,5 см)
        //футов в метры (1 фут равен 0,3048 м)
        //аршинов в метры (1 аршин равен 0,7112 м)
        //дюймов в миллиметры (1 дюйм равен 25,3995 мм)


        Scanner sc = new Scanner(System.in);
        System.out.println("Конвертер мер длины");
        while (true) {
            System.out.println("Выберите конвертер: 1 = саженей в метры, 2 = дюймов в сантиметры, 3 = футов в метры, 4 = аршинов в метры, 5 = дюймов в миллиметры");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите сажень:");
                    double fathom = sc.nextDouble();
                    System.out.println(fathom + " сажень = " + fathom * 2.1366 + " метр");
                    System.out.println("Continue? y/n");
                    String ch = sc.next();
                    if (!ch.toLowerCase().equals("y"));
                    break;
                case 2:
                    System.out.println("Введите дюйм");
                    double inch = sc.nextDouble();
                    System.out.println(inch + " дюйм = " + inch * 2.5 + " сантиметров");
                    System.out.println("Continue? y/n");
                    String ch1 = sc.next();
                    if (!ch1.toLowerCase().equals("y"));
                    break;
                case 3:
                    System.out.println("Введите фут");
                    double ft = sc.nextDouble();
                    System.out.println(ft + " фут = " + ft * 0.3048 + " метров");
                    System.out.println("Continue? y/n");
                    String ch2 = sc.next();
                    if (!ch2.toLowerCase().equals("y"));
                    break;
                case 4:
                    System.out.println("Введите аршин");
                    double arshin = sc.nextDouble();
                    System.out.println(arshin + " аршин = " + arshin * 0.7112 + " метров");
                    System.out.println("Continue? y/n");
                    String ch3 = sc.next();
                    if (!ch3.toLowerCase().equals("y"));
                    break;
                case 5:
                    System.out.println("Введите дюйм");
                    double inch1 = sc.nextDouble();
                    System.out.println(inch1 + " дюйм = " + inch1 * 25.3995 + " миллиметров");
                default:
                    System.out.println("Continue? y/n");
                String ch4 = sc.next();
                if (!ch4.toLowerCase().equals("y"));
                break;

            }
        }
    }
}
