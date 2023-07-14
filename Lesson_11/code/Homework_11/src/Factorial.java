import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        //Вводится n - натуральное число. Напишите метод, который получает
        // на вход n и вычисляет n! = 1 * 2 * 3 *... * n (n факториал) 10! = 1 * 2 * 3 * ... * 10
        // Вызовите полученный метод. При каком значении n происходит переполнение памяти,
        // выделяемой для n типа int?

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");//приглашение пользователю
        int n = sc.nextInt();// считываем целое число (до какого числа будем вычеслять факториал)
        int factorial = factorialN(n);//вызов метода с параметром n
        System.out.println("factorial of the number " + n + " is " + factorial);
    }//end of main

    //----------------method-----------------------
    public static int factorialN (int a) {
        int i = 0;// начальное значание параметр (счетчик)
        int sum = 1; // переменная для накапления результата
        while (i < a) { //пока i растет n - 1
            i ++;// увеличение параметра цикла
            sum = sum * i;//вычисление факториала

        }
        return sum;
    }//--------------end of method-----------------

}//end of class