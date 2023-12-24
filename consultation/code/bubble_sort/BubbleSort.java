package bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    // bubble sort O(n^2)
    public static void main(String[] args) {
        int[] numbers = {-1, 0, 7, 6, 5, 4, 3, 2, 1,};

        print(numbers);
        bubbleSort(numbers);
        print(numbers);

    } //end of main


    public static void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            boolean sorted = true; //сокращает проход по циклу (улучшает алгоритм)
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int buffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buffer;
                    sorted = false;
                }
            }
            System.out.println((j + 1) + ": " + Arrays.toString(arr));
            if (sorted)
                break;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
} // end of class
