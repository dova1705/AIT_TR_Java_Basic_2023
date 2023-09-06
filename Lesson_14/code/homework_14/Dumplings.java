package homework_14;

public class Dumplings {
    public static void main(String[] args) {
        //Задача про поиск "счастливого пельменя", часть 1.
        // Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм.
        // Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя.

        int [] num = new int[30];//объявление массива
        int a = 25, b = 35;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int)(Math.random() * (b - a + 1) + a);
        }
        printArray(num);
    }//end of method main
    //----------------methods-------------------------

    public static void printArray (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }//end of methods
}//end of class
