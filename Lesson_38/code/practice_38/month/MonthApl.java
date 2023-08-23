package practice_38.month;

public class MonthApl {
    public static void main(String[] args) {

        Month month = Month.DEC;//взяли месяц
        System.out.println(month);//напечатали
        System.out.println(month.plusMonth(3)); //Вызов метода отсчет идет с декабря 6-й строке определили. Ожидаем MAR
        System.out.println(month.plusMonth(13)); //вызов метода ожидаем JAN
        System.out.println(Month.getName(14)); //Ожидаем FEB. Метод вызываем по имени класса потому что метод static
        System.out.println("============кол-во дней по имени месяца============");
        //способ 1
        Month month1 = Month.AUG;//взяли месяц в переменную
        System.out.println("в месяце август " + month1.getDays() + " дней"); //количество дней в месяце
        //способ 2
        System.out.println("в месяце август " + Month.AUG.getDays() + " дней"); //по имени месяца
    }
}
