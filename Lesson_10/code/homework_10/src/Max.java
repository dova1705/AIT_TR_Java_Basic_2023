import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        //Написать метод, определяющий максимум из трех натуральных чисел. Числа вводит пользователь с клавиатуры.
        // Метод должен быть защищен от ввода отрицательных чисел. - ЭТО ПОКА МОЖНО НЕ ДЕЛАТЬ

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:"); //сообщение пользователю
        int firstN = sc.nextInt();//читаем строку
        System.out.println("Введите второе число:"); //сообщение пользователю
        int secondN = sc.nextInt();//читаем строку
        System.out.println("Введите третье число:"); //сообщение пользователю
        int thirdN = sc.nextInt();//читаем строку

        if ((firstN > secondN) && (firstN > thirdN)){
            System.out.println(firstN);
        } else if ((secondN > firstN) && (secondN > thirdN)) {
            System.out.println(secondN);
        } else if ((thirdN > firstN) && (thirdN > secondN)) {
            System.out.println(thirdN);
        } else {
            System.out.println("вы ввели одинаковые числа");
        }

    }//end of main
    /*
    public static int max (int a, int b, int c){

    }
    */

}//end of class


/*

    импортировать java.io.*;
    class Demo {
        static int наибольший (int x, int y, int z) { if (x > = y && x > = z)
        return x; иначе если (y > = x && y > = z) вернуть y; иначе вернуть z; }
        public static void main (String args []) {
        int a, b, c, наибольший;
        а = 5; б = 10;
        c = 3 наибольший = наибольший (a, b, c);
        System.out.println("самое большое число из трех" + самое большое); } }
 */