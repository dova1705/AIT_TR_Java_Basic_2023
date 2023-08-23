package practice_39.time_appl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
//
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

        LocalDate currentDate = LocalDate.now();//настоящее время
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); //вернули дату и время в международном формате 2023-08-16T22:03:35.454631700 (T это разделитель)

        LocalDate gagarin = LocalDate.of(1961,4,12);
        System.out.println(gagarin.getYear());
        System.out.println(gagarin.getDayOfYear());

        System.out.println("Gagarin day of month " + gagarin.getDayOfMonth());
        System.out.println("Gagarin day of week " + gagarin.getDayOfWeek());
        System.out.println(gagarin.isBefore(currentDate));//ожидаем true
        System.out.println(gagarin.isAfter(currentDate));//ожидаем false

        System.out.println("============Traveling In Time============");
        //add days to current day

        LocalDate newDate = currentDate.plusDays(40);
        System.out.println(newDate);

        newDate = currentDate.plusWeeks(12);
        System.out.println("Add 12 weeks: " + newDate);

        //2 month ago
        newDate = currentDate.minusMonths(2);
        System.out.println("2 month ago: " + newDate);


    }
}
