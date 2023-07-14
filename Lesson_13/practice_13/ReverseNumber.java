import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        //Пользователь вводит натуральное число. Распечатайте это число в обратном порядке.

        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer positive number: ");
        int n = sc.nextInt();
        int digits = 0;//инициировал счетчик цифр
        int nd = n;

        //занесем цифру числа в массив, а потом распечатаем его. Если надо будет то его распечатаем в обратном порядке
        //этот цикл считает колличество цифр в числе, вычисляем длину нужного нам массива
        while (n > 0){
            digits ++;//считаю количество цифр
            n = n / 10;// целочисленное деление изминение параметра цикла
        }
        System.out.println("количество цифр " + digits);

        int[] digit = new int[digits];//задаем массив длиной сколько у нас есть цифр в числе n

        //в массив digit заносим цифры числа
        for (int i = 0; i < digit.length; i++) {
            digit[i] = nd % 10;//остаток от деления на 10
            nd = nd / 10;//уменшение числа в 10 раз
        }
        printArray(digit);
        System.out.println();
        printArrayReverse(digit);
    }
    //----------Methods--------------------
    public static void printArray (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }

    public static void printArrayReverse (int [] arr) {
        for (int i = arr.length -1; i >= 0; i--) {
            System.out.print(arr[i] + " | ");
        }
    }
    //------------end of Method---------------
}
