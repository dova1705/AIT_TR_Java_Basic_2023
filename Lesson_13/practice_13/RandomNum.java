import java.util.Scanner;
public class RandomNum {
    public static void main(String[] args) {
        // Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
        // Запросите у пользователя какое-то натуральное число. Определите, есть ли это число в массиве.
        // Создайте и используйте метод searchInArray, который получает на вход массив и искомое число,
        // а возвращает ответ - нашлось ли это число в массиве.

        Scanner sc = new Scanner(System.in);

        int [] num = new int[10];
        int a = 1, b = 100;
        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайнымы натуральнымы числами
           num[i] = (int)(Math.random() * (b - a + 1) + a);
        }
        printArray(num);//вызов метода и печатаем массив
        System.out.println();

        System.out.println("Input number for search (integer and positive): ");
        int n = sc.nextInt();

        while (n < 0){
            System.out.println("Wrong input! Try again");
            n = sc.nextInt();//даем возможность ввод числа
        }

        //вызов метода поиска и печать результата
        searchInArray(num, n);
        if (searchInArray(num, n)) {
            System.out.println("We find the number! " + "индекс: " + searchIndexInArray(num, n));
        } else {
            System.out.println("We didn't find the number!");
        }
    }
    //------------Method----------------------

    public static int searchIndexInArray(int[] arr, int x) {
        int index = -1;//несуществующий индекс
        for (int i = 0; i < arr.length; i++) {
            //проверяем, что в массиве есть искомое число
            if (x == arr[i]) {
                index = i;
                return index;//это индекс найденного цисла
            }
        }
        return index;
    }

    public static boolean searchInArray(int[] arr, int x) {
        //boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            //проверяем, что в массиве есть искомое число
            if (x == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static void printArray (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
    //------------end of Method---------------
}
