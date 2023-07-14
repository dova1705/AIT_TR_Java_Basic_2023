import java.util.Scanner;
public class SumOfOddElements {
    public static void main(String[] args) {
        //Написать метод, принимающий массив целых чисел, и возвращающий сумму всех его нечетных элементов
        // (не индексы!, а сами элементы).
        // Массив на 100 элементов задать случайными числами в интервале от 1 до 100.

        Scanner sc = new Scanner(System.in);

        int [] num = new int[5];//обявление м массива
        int a = 1, b = 100;
        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int)(Math.random() * (b - a + 1) + a);
        }
        printArray(num);//вызов метода и печатаем массив
        System.out.println();
        System.out.println("сумма нечетных чисел от 1 до 10 равен: " + sumArray(num));//вызов метода и печатаем результат

    }
    public static int sumArray (int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                sum = sum + arr[i];//накапление суммы
            }

        }
        return sum;
    }

    public static void printArray (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
