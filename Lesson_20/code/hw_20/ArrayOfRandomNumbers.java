package hw_20;

public class ArrayOfRandomNumbers {
    public static void main(String[] args) {
        //Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
        //положительных чисел;
        //отрицательных чисел;
        //четных чисел;
        //нулей.

        //массив
        int[] arrNum = new int[10];
        int a = -10, b = 10;
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = (int)(Math.random() * (b - a + 1) + a);
        }

        printArray(arrNum);//вызов метода и печатаем

        System.out.println();//отступ вниз
        System.out.println("положительные числа: ");

        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] > 0){
               System.out.print(" " + arrNum[i]);
            }
        }
        System.out.println();//отступ вниз

        System.out.println("отрицательные числа: ");
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] < 0) {
                System.out.print(" " + arrNum[i]);
            }
        }

        System.out.println();
        System.out.println("целые числа: ");
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] % 2 == 0) {
                System.out.print(" " + arrNum[i]);
            }
        }
        System.out.println();
        System.out.println("количество нулей: ");
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] == 0 ){
                System.out.print(" " + arrNum[i]);
            }
        }
    }

    //------Метод-----------
    public static void printArray (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
    public static int positiveNumb(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

}
