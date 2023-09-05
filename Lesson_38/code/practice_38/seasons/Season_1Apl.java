package practice_38.seasons;

public class Season_1Apl {
    public static void main(String[] args) {
        Season_1 season1 = Season_1.AUTUMN;
        System.out.println(season1);

        System.out.println(Season_1.SPRING);
        System.out.println(season1.name());

        System.out.println("============================values (величина)============================");
        Season_1[] season_1s = Season_1.values();
        for (int i = 0; i < season_1s.length; i++) {
            System.out.println(season_1s[i]);
        }

        System.out.println("============================ordinal (порядковый номер)============================");
        System.out.println(season1.name());
        System.out.println(season1.ordinal());//ordinal - порядковый номер в списке enum
        System.out.println(season1.SPRING.ordinal());//ожидаем индекс 1
        System.out.println(season1.SUMMER.ordinal());//ожидаем индекс 2
    }
}
