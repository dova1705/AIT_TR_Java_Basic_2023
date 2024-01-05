package practice_65;

public class Fibonacci {
    public static void main(String[] args) {

       // System.out.println(fibonacci(6));

       // System.out.println(fibonacci2(5, )); //не понял как использовать
    }
    public static int fibonacci(int n){
        if (n <= 1){
            return n; //базовый случай
        }else {
            return fibonacci(n -1) + fibonacci(n - 2); //рекурсивный случай
        }
    }

    public static int fibonacci2(int n, int[] memo){
        if (n <= 1){
            return n; //базовый случай
        }
        if (memo[n] != -1) {
            return memo[n]; // возвращаем сохраненный результат, если он есть
        }
        memo[n] = fibonacci2(n - 1, memo) + fibonacci2(n - 2, memo); // сохраняем результат перед возвратом
        return memo[n];
    }
}
