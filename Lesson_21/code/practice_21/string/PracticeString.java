package practice_21.string;

public class PracticeString {
    public static void main(String[] args) {
        String str = "Ich liebe Java sehre stark!";
        System.out.println("String " + str);

        String[] words = str.split(" ");//разделяем строку на слово, потому что разделителем является пробел " "
        int n = words.length;

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        String symbol = "Ich liebe Java sehre stark!";
        System.out.println("String " + str);

        String[] symbols = str.split("");//разделяем строку на слово, потому что разделителем является пробел " "
        int m = words.length;

        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i] + " | ");
        }
    }
}
