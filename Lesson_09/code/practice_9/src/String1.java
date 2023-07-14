import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        //Пользователь вводит строку. Распечатайте каждую букву строки на новой строчке.
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слово: ");//приглашение пользователю
        String s = sc.nextLine();//читаем строку
        System.out.println("String: " + s); //печатаем строку
        int l = s.length();//определили длину строки
        System.out.println("длина строки: " + l); //напечатали длину
        int pointer = 0;

        while (l > 0) {
            System.out.println(s.charAt(pointer));//печатаем  букву из строки
            pointer ++; //двигаем указатель по строке в право
            l --; //уменьшаем длину строки
        } //end of while

    } //end of method main

} // end of class
