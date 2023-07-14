import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Задача 3
        //Написать программу, в которую пользователь вводит имя и фамилию в одну строку через пробел.
        // Программа должна выводить имя и фамилию на разных строках. Первая буква имени и фамилии
        // дольжны быть большими не зависимо от того, как их ввел пользователь, лишние пробелы должны быть удалены. (повторение методов String)

        System.out.println("Ваша имя и фамилия:");//приглашение пользователю
        String userNameSurname = scanner.nextLine();//читаем строку
        userNameSurname = userNameSurname.trim();//отсекли случайные пробелы в начале и в конце

        int l = userNameSurname.length();//узнаем длину
        int firstWhitespace = userNameSurname.indexOf(' ');// нашли первый пробел
        String a = userNameSurname.substring(0, firstWhitespace);//
        String name = a.substring(0, 1).toUpperCase() + userNameSurname.substring(1);
        //String b = a.substring(firstWhitespace + 1, userNameSurname.length());
        System.out.println(a);
        //System.out.println(b);

        /*
        import java.util.Scanner;

public class NameAndSurname {
    public static void main(String[] args) {
//        Написать программу, в которую пользователь вводит имя и фамилию в одну строку через пробел.
//        Программа должна выводить имя и фамилию на разных строках.
//        Первая буква имени и фамилии больжны быть большими не зависимо от того,
//        как их ввел пользователь, лишние пробелы должны быть удалены.
//        (повторение методов String)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name and surname:");
        String st = scanner.nextLine();

        // int l = name.length();
        st = st.trim(); // убираем пробелы
        int indexOfSpace = st.indexOf(" "); // находим индекс "пробела"

        String name = st.substring(0, indexOfSpace); // выкусываем подстроку с первого символа до пробела
        String surname = st.substring(indexOfSpace + 1, st.length()); // от пробела до конца строки

        System.out.println(name);  // печать
        System.out.println(surname); // печать

        name = stringCorrected(name); // вызов метода
        surname = stringCorrected(surname); // вызов метода

        System.out.println(name);
        System.out.println(surname);

    }
    // ___________Methods______________
    // метод делает заглавной 1-ю букву
    public static String stringCorrected (String string) {
        char firstLetter = string.toUpperCase().charAt(0); // первая буква строки делается заглавной
        String stringRest = string.substring(1,string.length()); // выкусывается строка без 1-й буквы
        return firstLetter + stringRest; // формируем результат
    }
    //___________end of Methods________
}


    // char firstLetterOfName = st.charAt(0);

         */




        scanner.close();//закрытие сканера

    }
}
