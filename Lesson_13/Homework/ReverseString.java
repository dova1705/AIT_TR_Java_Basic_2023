import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        //Пользователь вводит строку. Распечатайте эту строку в обратном порядке
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String st = sc.nextLine();

        System.out.println(reverseString(st));
    }
    //-------------метод----------------
      public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }  //-------------конец метода---------
}
