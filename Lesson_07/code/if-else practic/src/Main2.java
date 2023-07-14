import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("If - else practice - NEXT - NEXT");
        //Задание 3:
        // Написать метод, выводящий на экран максимальное из трех целых чисел. Числа должны вводится с клавиатуры

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:"); // приглашение пользователя
        int a = scanner.nextInt();
        System.out.println("Input 2-nd number:"); // приглашение пользователя
        int b = scanner.nextInt();
        System.out.println("Input 3-rd number:"); // приглашение пользователя
        int c = scanner.nextInt();

        // Алгоритм:
        // Шаг 1 - объявить переменную max
        // Шаг 2 - присвоим max = a (любую из наших переменных)
        // Шаг 3 - сравним b и max, если b > max то max = b
        // Шаг 4 - сравним с и max, если с > max то max = с


        int maximum = maxABC(a, b, c); //вызов метода и передали ему на вход три числа a, b, c
        System.out.println("максимальное из трех целых чисел " + a + ", " + b + ", " + c + " это: " + maximum);// печатаем результат
    }
        //_________Methods_____________
        public static int maxABC (int x, int y, int z) {
            int max = x;
            if (y > max) {
                max = y;
            }
            if (z > max) {
                max = z;
            }
            return max;
        }

        //_________End of Methods_______


    }
