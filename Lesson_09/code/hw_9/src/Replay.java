import java.util.Scanner;
public class Replay {
    public static void main(String[] args) {
        //Программа получает на вход строку и число повторений этой строки
        // Программа должна вывести эту строку нужное количество раз.
        Scanner sc = new Scanner(System.in);

        System.out.println("input the line");//приглашение пользавателю
        String s = sc.nextLine(); //читаем строку
        System.out.println("enter the number of repetitions");//сообшение пользователю
        int n = sc.nextInt();//читаем строку

        while (n > 0) {
            System.out.println(s);
            n --;
        } //end of while
    } //end of method main
} //end of class
