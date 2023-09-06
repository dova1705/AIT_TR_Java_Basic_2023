package practice_39.time_appl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

//нет полей
//нет конструкторов
//нет сеттеров и геттеров
//есть метод main
public class TimeAppl {

    //    Работа с датами:
//
//    узнать текущую дату и время
//    есть дата, какой это был день недели? день месяца? день года?
//    есть дата, как узнать, это было раньше? или позже?
//    Путешествие во времени
//
//    в будущее currentDay.plus
//    в прошлое currentDay.minus
//    использование ChronoUnit
//    Получение интервала времени
//
//    Сортировка массива по времени
//
//    Date Formatter
//
//    Парсинг даты из строки
    public static void main(String[] args) {
//        Работа с датами:
//        узнать текущую дату и время
//        есть дата, какой это был день недели? день месяца? день года?
//        есть дата, как узнать, это было раньше? или позже?
//
//        Путешествие во времени
//        в будущее currentDay.plus
//        в прошлое currentDay.minus
//        использование ChronoUnit
//        Получение интервала времени
//
//        Сортировка массива по времени
//
//        Date Formatter
//
//        Парсинг даты из строки

        LocalDate currentDate = LocalDate.now();//текущая дата класс LocalDate метод now()
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();//текущая время класс LocalTime метод now()
        System.out.println(currentTime);

        LocalDateTime localDateTime = LocalDateTime.now();////текущая дата и время класс LocalDateTime метод now()
        System.out.println(localDateTime);//вернули дату и время в международном формате 2023-09-05T20:38:56.449701500

        LocalDate gagarin = LocalDate.of(1961,4,12);//в переменную присвоили дату
        System.out.println(gagarin.getYear());//печать года из этой даты (дата = переменная gagarin)
        System.out.println(gagarin.getDayOfYear());//печать день из этой даты (дата = переменная gagarin)

        System.out.println("Гагаринский день месяца: " + gagarin.getDayOfMonth());//ожидаем день месяца (12)
        System.out.println("Гагаринская неделя месяца: " + gagarin.getDayOfWeek());//ожидаем enum название дня недели

        System.out.println(gagarin.isBefore(currentDate));//Ожидаем true. Метод isBefore на вход подали переменную currentDate (определили в 48-й строке)
        System.out.println(gagarin.isAfter(currentDate));//Ожидаем false. Метод isAfter на вход подали переменную currentDate (определили в 48-й строке)

        System.out.println("=============================Путешествие по времени=============================");

        //добавление дней к текущему дню
        LocalDate newDate = currentDate.plusDays(40);//в переменную newDate типа LocalDate присвоили переменную currentDate типа LocalDate (определили в 48-й строке) с методом plusDays
        System.out.println(newDate);

        //добавление недели к текущему дню
        newDate = currentDate.plusWeeks(12);//в переменную newDate типа LocalDate присвоили переменную currentDate типа LocalDate (определили в 48-й строке) с методом plusWeeks
        System.out.println("Через 12 недели: " + newDate);

        //2 месяца назад
        newDate = currentDate.minusMonths(2);//в переменную newDate типа LocalDate присвоили переменную currentDate типа LocalDate (определили в 48-й строке) с методом minusMonths
        System.out.println("2 месяца назад: " + newDate);

        //работа с ChronoUnits (ChronoUnits это единица времени)
        System.out.println(localDateTime.plus(9, ChronoUnit.HALF_DAYS));//сколько половинок дней прошло

        //CENTURY = 100 лет
        newDate = currentDate.plus(10, ChronoUnit.CENTURIES);//amountToAdd 10 - добавляет 10. ChronoUnit.CENTURIES это что добавить (день, неделя, год, век....) в данном случае 10 веков
        System.out.println("Через 10 лет " +  newDate);

        //получение интервала времени (enum ChronoUnit)
        LocalDate lenin = LocalDate.of(1870,4,22);
        long res = ChronoUnit.YEARS.between(lenin, gagarin);//метод YEARS.between на вход принимает две даты и возвращает полное количество лет между ними.
        System.out.println("День рождения Ленина - день старта Гагарина (в годах): " + res);

        System.out.println("Сравнение LocalDate");
        System.out.println(lenin.compareTo(gagarin));//сравнение дат

        //LocalDate сортировка
        LocalDate[] dates = {gagarin, currentDate, lenin};
        Arrays.sort(dates);//сортировка объекта
        System.out.println(Arrays.toString(dates));

        System.out.println("===============форматер===============");
        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(gagarin.format(df));
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy");//поменяли формат даты (MMMM -печатает полное название месяца)
        System.out.println(gagarin.format(df));

        String date1 = "06/07/2023";
//        String date2 = "2023-02-02";

        LocalDate localDate1 = dateParse(date1);
        System.out.println(localDate1);
//        LocalDate localDate2 = dateParse(date2);//возможно отдельный метод нужен
//        System.out.println(localDate2);
    }

    private static LocalDate dateParse(String date){//на вход получает String
        //DateTimeFormatter df = DateTimeFormatter.ofPattern("[yyyy-MM-dd]");//применили форматер, формат сами определили DateTimeFormatter.ofPattern("[dd/MM/yyyy] [yyyy-MM-dd]")
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy]");
        return LocalDate.parse(date, df);//возвращает date с применением форматера df
//        if (date.contains("-")){
//            return LocalDate.parse(date);
//        } else {
//            return LocalDate.parse(date,df);
//        }
    }
}
