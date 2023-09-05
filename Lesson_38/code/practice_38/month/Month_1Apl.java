package practice_38.month;

public class Month_1Apl {
    public static void main(String[] args) {
        Month_1 month_1 = Month_1.DEC;//взяли месяц
        System.out.println(month_1);//напечатали
        System.out.println(month_1.plusMonth(5));//Вызов метода отсчет идет с декабря 5-й строке определили. Ожидаем MAY
        System.out.println(month_1.plusMonth(13));//ожидаем JAN

        System.out.println(Month_1.getName(62)); //ожидаем FEB

        System.out.println("==========================Количество дней по имени месяца==========================");
        //способ 1
        Month_1 month_2 = Month_1.AUG;//взяли месяц в переменную
        System.out.println("количество дней в августе " + month_2.getDays());//количество дней в месяце
        //способ 2
        System.out.println("количество дней в августе " + Month_1.AUG.getDays());//количество дней по имени месяца

    }
}
