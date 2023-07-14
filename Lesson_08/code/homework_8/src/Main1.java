import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Задача 2
        //Используя оператор switch ... case написать бот, который помогает выбрасывать мусор в баки разных цветов:
        //упаковки в желтый бак
        //пищевые отходы в коричневый бак
        //бумага в зеленый бак
        //прочие отходы в черный бак

        System.out.println("помошник по выбрасыванию мусора: ");//сообшение пользователю
        System.out.println("--------------------------------------------------------------");
        System.out.println("Выберите мусор: упаковки - 1, пищевые отходы - 2, бумага - 3, прочие отходы - 4");//сообшение пользователю
        int userSelection = scanner.nextInt();//читаем операцию (выбор пользователя)

        switch (userSelection) {
            case 1: {
                System.out.println("выбрасывайте в жёлтый бак");//сообшение пользователю
                break;
            }
            case 2: {
                System.out.println("выбрасывайте в коричневый бак");//сообшение пользователю
                break;
            }
            case 3: {
                System.out.println("выбрасывайте в зеленый бак");//сообшение пользователю
                break;
            }
            case 4: {
                System.out.println("выбрасывайте в черный бак");//сообшение пользователю
                break;
            }
            default: {
                System.out.println("не правильно выбран мусор))");
            }
        }

        scanner.close();//закрытие сканера

    }
}