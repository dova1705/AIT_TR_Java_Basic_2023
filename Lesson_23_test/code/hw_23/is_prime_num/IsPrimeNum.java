package hw_23.is_prime_num;

public class IsPrimeNum {

    public static boolean primeN (int a) {
        boolean isPrime = true;
        //System.out.println("n = " + a);
        for (int i = 2; i < a - 1; i++) {//для сокращения кол-во. циклов в место i < a - 1 можно написать i < Math.sqrt(a)
            if (a % i == 0) {//если хотя-бы разделилось, то
                isPrime = false;//объявим что число НЕ простое и можно выйти из цикла
            }
        }
        return isPrime;
    }
}
