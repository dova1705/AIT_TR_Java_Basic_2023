import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        //Составьте программу, которая вычисляет сумму чисел от 1 до 1/n. n вводится с клавиатуры.
        // Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Для вычисления sum используйте метод.

        //что на входе - число N, N = 10 int num (или n, number)
        //на выходе - 1 + 2 + 3 + .... + 8 + 9 + 10
        //ключевой алгоритм - запустить цикл while
        // количество повторов (N -1) пока что-то меньше N, а начинаем с - 1
        //будем накапливать сумму на каждом шагу цикла в этой переменной int sum
        //параметр цикла int i, i = 1, на каждом шагу цикла i = i + 1
        // 10 < 10 имеет значение false

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");//приглашение пользователю
        long num = sc.nextLong();// считываем целое число
        double sumDigits = sumN(num);// ввызов метода
        System.out.println("Sum of digits: " + sumDigits);//печатаем результат
    }//end of main

    //---------Method--------------
    public static double sumN (long n){
        double  i = 1; // задаем переменную и даем ей начальное значение
        double sum = 0; // задаем переменную и даем ей начальное значение
        while (i <= n){ //пока параметр цикла i меньше или равно n
            sum = sum + 1 / i; // накапливаем сумму
            i = i + 1; // увеличиваем параметр цикла
        }
        return sum;
    }//--------End of Method-------
}//end of class