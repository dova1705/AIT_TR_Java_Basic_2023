package practice_66;

public class Factorial {
    public static void main(String[] args)  {
        // 5! -> 1 * 2 * 3 * 4 * 5 = 120
        System.out.println(factorialRecursive(5)); //120
        System.out.println(factorial(5)); //120
    }
    static int factorialRecursive (int x){
        if (x < 0){
            return -1;
        }
        if (x == 1){
            return 1;
        }
        return x * factorialRecursive(x - 1);
    }

    static long factorial(long x){
        if (x < 0){
            return -1;
        }
        if (x == 1){
            return 1;
        }
        long result = 1;
        for (int i = 1; i <=x; i++) {
            result = result * i;
        }
        return result;
    }
}
