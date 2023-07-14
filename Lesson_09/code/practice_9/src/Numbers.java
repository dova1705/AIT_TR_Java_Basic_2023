import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        //Задача 4.
        // Пользователь вводит натуральное число (целое, положительное).
        // Выясните, сколько цифр в числе.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number"); // приглашение пользователю
        int numb = scanner.nextInt(); //читаем строку

        // Алгоритм:
        // нужно число делить нацело на 10 до тех пор пока частное больше 0 (целочисленное деление)
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0 целых
        // на каждом шагу увеличиваем счетчик на 1

        int count = 0; //начальное значение
        int div = numb;

        while (div > 0){ //пока частное больше 0
            div = div / 10; //делим на 10 вычесляем частное
            count ++;
        }//end of while

        System.out.println( "в введенном вашем числе цифр: " + count);
    }//end of method main
}//end of class
