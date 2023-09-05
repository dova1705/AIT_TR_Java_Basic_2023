import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        //тело основного метода main

        System.out.println("Methods practice");
        //определить количество цифр у натурального числа (делим в цикле число на 10 пока
        // остаток от деления больше 0)

        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer positive number: ");
        int num = sc.nextInt();
        int digits = numberOfDigits(num);// вызов метода и передача ему на вход параметра
        System.out.println("Numbers of digits is: " + digits);
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits is: " + sum);

    }

    //__________Methods__________________

    public static int numberOfDigits (int n){
        int count = 1; //инициировал счетчик цифр
        while (n / 10 > 0){
            count ++; //считаю количество цифр
            n = n / 10;// целочисленное деление
        }
        return count;

    }

    public static int sumOfDigits (int n) {
        int adder = 0;
        while (n % 10 > 0) {
            adder = adder + n % 10;//это цифра числа их суммируем (цифра после запятой) знак процента "%" деление с остатком
            n = n / 10;//уменьшает число в 10 раз
        }
        return adder;
    }


    //__________End of Methods___________
}
