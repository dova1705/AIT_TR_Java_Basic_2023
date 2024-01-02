package practice_67.oop.geometric_figures;

public class StartApp {
    public static void main(String[] args) {
//        Drawable circle = new Circle();
//        Drawable square = new Square();
//
//        method(circle);
//        method(square);
        int[] num = {9, 1, 8, 6, 3, -2, 17, 0};
        bubbleSort(num);
        printArr(num);

    }

    public static void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            boolean sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
            System.out.print(arr + ": ");
            if (sorted)
                break;
        }
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    static void method(Drawable drawable) {
        drawable.draw();
    }
}
