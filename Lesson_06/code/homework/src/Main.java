
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // включение Scanner

        //Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
        System.out.println("Practice");

        String st = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(st); // печатаем строку

        //Распечатать последний символ строки
        int length = st.length(); //определяет длину
        System.out.println("длина строки: " + length); //печатаем результат

        char lastSymbol = st.charAt(st.length() - 1); //выводит последний символ
        System.out.println("последний символ это: " + lastSymbol);// печатаем результат

        //Найти позицию подстроки “Java” в строке.
        int index = st.indexOf("Java"); // узнаем с какого индекса начинается слово Java
        System.out.println("индекс Java " + index); //печатаем результат

        // Проверить, содержит ли заданная строка подстроку “Java”
        boolean verify = st.contains("Java");
        System.out.println(verify);

        //Заменить все символы “o” на “a”

        String replacingLetters =  st.replace("o", "a"); // замена всех букв "а" на "о"
        System.out.println(replacingLetters); //печатаем результат


        //Преобразуйте строку к верхнему регистру.
        System.out.println("все буквы вверхнем регистре:");//сообщение пользователю
        String largeLetters = st.toUpperCase();
        System.out.println(largeLetters);//печатаем результат

        //Преобразуйте строку к нижнему регистру.
        System.out.println("все буквы в нижнем регистре:");//сообщение пользователю
        String smallLetters = st.toLowerCase();
        System.out.println(smallLetters);//печатаем результат

        //Вырезать строку Java c помощью метода substring()
        String cut = st.substring(19, 23);
        System.out.println(cut);//печатаем результат

        //Проверить, заканчивается ли ваша строка подстрокой “!!!”.
        Boolean check1 = st.endsWith("!!!");
        System.out.println(check1);//печатаем результат

        //Проверить, начинается ли ваша строка подстрокой “I'm proud”
        Boolean check2 = st.startsWith("I'm proud");
        System.out.println(check2);//печатаем результат


        //Задача 2
        //Запросить у пользователя длину радиуса окружности. Написать метод, который
        // находит площадь круга для введенного радиуса. Вычислить площадь круга, вызвав
        // написанный метод. S = π × r 2

        System.out.println("Введите длину радиуса:"); //сообщение пользователю
        double radius = sc.nextDouble(); //читаем строку
        System.out.println("радиус: " + radius);// печатаем строку
        double sq = square(radius); //вызов метода
        System.out.printf("площадь круга равен: %.4f", sq);
        System.out.println();

        //Задача 3
        //Даны строки разной длины (длина - четное число), необходимо вернуть два средних знака этой строки.
        // Например, если дана строка "string" результат будет "ri", для строки "code" результат "od" для
        // "Practice" результат "ct".

        System.out.println("введите текст");
        String one = sc.next();//читаем строку
        int longs = one.length();
        String average = one.substring(longs / 2 - 1, longs / 2 + 1);
        System.out.println("два средних знака: " + average);


    }
    //---------------------------------метод----------------------
    public static double square(double r) {
        double s = Math.PI * r * r;
        return s;
    } //---------------------------------конец метода----------------------
}