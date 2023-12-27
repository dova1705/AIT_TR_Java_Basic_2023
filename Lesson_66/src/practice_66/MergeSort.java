package practice_66;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {9, 8, 1, 7, -1, 6, 0};
        mergeSort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    private static void mergeSort(int[] arr) {
        int n = arr.length; //взял длину массива
        if (n == 1) return; // это нужно, для того чтобы остановить массив так как мы используем рекурсию

        int mid = n / 2;
        int[] l = new int[mid]; // левая част массива
        int[] r = new int[n - mid]; // правая часть массива

        for (int i = 0; i < mid; i++) // присваиваю значение левой части массива
            l[i] = arr[i];

        for (int i = mid; i < n; i++)  // присваиваю значение правой части массива
            r[i - mid] = arr[i];

        mergeSort(l); //чтобы они делились на 2
        mergeSort(r); //чтобы они делились на 2
        merge(arr, l, r); //собираем массив обратно
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0; // отвечает за левую часть
        int j = 0; // отвечает за правую часть
        int idx =0;

        while (i < left && j < right){
            if (l[i] < r[j]){
                arr[idx] = l[i];
                i++;
                idx++;
            }else {
                arr[idx] = r[j];
                j++;
                idx++;
            }
        }

        for (int ll = 0; ll < left; ll++) {
            arr[idx++] = l[ll];
        }
        for (int rr = 0; rr < right; rr++) {
            arr[idx++] = r[rr];
        }
    }
}
