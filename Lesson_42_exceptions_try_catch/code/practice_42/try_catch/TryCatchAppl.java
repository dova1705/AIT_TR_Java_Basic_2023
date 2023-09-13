package practice_42.try_catch;

import java.util.Scanner;

public class TryCatchAppl {
    public static void main(String[] args) {

//        Деление на 0;
//        Выход за пределы массива;
//        Проверка ввода пользователя на корректность.
/*
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число");
            int a = sc.nextInt();
            System.out.println("Введите второе число");
            int b = sc.nextInt();
            int division = a / b;
            System.out.println("Деление " + a + " / " + b + " = " + division);
        }
        catch (Exception e){
            System.out.println(e.getMessage() + " , " + e.getCause());
        }


        try {
            int[] arr = {5, -7, 17, 29, 30};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println(arr[7]);
        }
        catch (Exception e){
            System.out.println(e.getMessage() + ", " + e.toString());
        }

 */
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число");
            int a = sc.nextInt();
            System.out.println("ваша введенное число " + a);
        }
        catch (Exception e) {
            System.out.println(e.getMessage() + ", " + e.toString());
        }
    }
}
