package hw_27;

public class SearchDuplicatesInArray {
    public static void main(String[] args) {

//        char[] chars = {'c', 'a', 't', 'a', 'm', 'a', 'r', 'a', 'n'};
//        String str = new String(chars, 0,3);
//        System.out.println(str);

        int[] myArray = new int[20];
        int a = 1;
        int b = 10;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)(Math.random() * (b - a + 1) + a);
        }
        printArray(myArray);

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    System.out.println(j);
                }
            }
        }
    }//end of method main

    public static void printArray (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " | ");
        }
    }

    //public static

}
