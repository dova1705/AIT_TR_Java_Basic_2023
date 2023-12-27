package practice_66;

public class MinNum {
    public static void main(String[] args) {
        int[] nums = {-99, -100, 1, 9 , 0, 4, 65, 12};
        int min = nums[0];
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min2 = min;
                min = nums[i];
            } else if (min2 > nums[i] && min != nums[i]) {
                min2 = nums[i];
            }
        }
        System.out.println(min);

//        int min2 = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (min2 > nums[i] && min != nums[i]) min2 = nums[i];
//        }
        System.out.println(min2);
    }
}
