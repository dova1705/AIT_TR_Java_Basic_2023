package hw_19;

import java.util.Arrays;
import java.util.Scanner;

public class DivisorOfNum {
    public static void main(String[] args) {
        // (на повторение темы массивы, циклы и вычисления) Вводится пользователем натуральное число n.
        // Сформировать массив из всех делителей данного числа.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное целое число: ");
        int num = sc.nextInt();//считали число
        int[] arr = new int[num];//определили массив очень широко
        int j = 0; //индекс для массива с делителями числа n
        System.out.println("n = " + num);
        //заполняем массив делителями числа n
        for (int i = 1; i <= num; i++) {
            if(num % i ==0){//если n разделилось на i, то
                arr[j] = i;// записываем делитель в массив
                j++;//индекс элементов массива увеличиваем на 1
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.println( arr[i]);
        }
        System.out.println("количество простых чисел: " + j);
        System.out.println("простые числа: " + arr.length);
        /*
        int count = 0;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.println(count);

        int[] arrNum = new int[count];
        System.out.println(Arrays.toString(arrNum));

*/
    }

}
