package practice_38.seasons;

public class SeasonApl {
    public static void main(String[] args) {
        Season season = Season.WINTER;
        System.out.println(season);

        System.out.println(Season.AUTUMN);
        System.out.println(season.name());

        System.out.println("===================VALUES==================="); //values = величина
        Season[] seasons = Season.values();// в массив положили все 4 сезонов
        for (int i = 0; i < seasons.length; i++) {//цикл
            System.out.println(seasons[i]); //печать массива
        }

        System.out.println("===================ORDINAL===================");
        System.out.println(season.name());
        System.out.println(season.ordinal()); //ordinal - порядковый номер в списке enum
        System.out.println(season.SPRING.ordinal()); //ожидаем индекс 1
        System.out.println(season.AUTUMN.ordinal()); //ожидаем индекс 3
    }
}
