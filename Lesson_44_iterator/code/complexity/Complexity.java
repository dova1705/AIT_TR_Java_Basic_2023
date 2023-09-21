package complexity;

import java.util.Arrays;

public class Complexity {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19};

        // кол-во операций не зависит от длины массива
        double mid = (double) (arr[0] + arr[arr.length - 1]) / 2;
        // Вычисление среднего значения
        // кол-во действий
        // 1. Взять 0-й элемент
        // 2. вычислить arr.length
        // 3. Взять посл. элемент
        // 4. сложить элементы
        // 5. разделить на 2
        // это константная сложность O(5)


        // сложение эл-ов массива
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // при увеличении кол-ва эл-ов массива кол-во операций растет прямо пропорционально (линейно)
        // это линейная сложность O(n)

        // поиск элемента массива с помощью BinarySearch
        int index = Arrays.binarySearch(arr, 10);

        // При 8 элементах - 3 операции
        // при 16 элементах - 4 операции
        // ...
        // при 1024 элемента - 10 операций
        // при 2048 - 11 операций
        // такая сложность называется O(log(n)) - логарифмическая сложность

        // сортировка массива BubbleSort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 ; j++) {
                if(arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        //такая сложность называется O(n^2))

        Arrays.sort(arr);
        // Такая сложность называется полилинейная (?)

    }
}
