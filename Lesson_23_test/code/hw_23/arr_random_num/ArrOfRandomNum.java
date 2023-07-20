package hw_23.arr_random_num;

public class ArrOfRandomNum {


    //метод для определения количество положительных чисел
    public int positiveNumbers(int[] arrNum){
        int positivNum = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] > 0){
                positivNum++;
            }
        }
        return positivNum;
    }

    //метод для определения количество целых чисел
    public int evenNum (int[] arrNum){
        int even = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] % 2 == 0){
                even++;
            }
        }
        return even;
    }

    //метод для определения количество отрицательных чисел
    public int negativeNum (int[] arrNum){
        int positive = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] < 0) {
                positive ++;
            }
        }
        return positive;
    }

    //метод для определения количество нулей
    public int zero (int[] arr){
        int z = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                z++;
            }
        }
        return z;
    }
}//end of class
