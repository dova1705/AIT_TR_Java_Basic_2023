public class BreakContinueExample {
    public static void main(String[] args) {
        //напечатать каждый элемент массива
        //Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.

        int[] num = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};//задали массив
        for (int i = 0; i < num.length; i++) {
            if (i % 2 ==0){//проверяем индекс элемента массива на четность
                continue;
            }
            System.out.print(num[i] + " / ");//печатаем каждый результат (пропуская каждый второй)

        }
        System.out.println();
        System.out.println("=========================================");

        int n = 553;//дано число
        //найти первый делитель введенного числа
        for (int i = 2; i < n-1; i++) {
            if (553 % i == 0) {//  % - это деление с остатком, результат = остатку от деления
                System.out.println(n + " делится на цело на: " + i);
                break;
            }
        }
    }//end of method main
}//end of class
