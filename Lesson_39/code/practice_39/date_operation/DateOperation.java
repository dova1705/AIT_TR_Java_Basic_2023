package practice_39.date_operation;

import java.time.LocalDate;
import java.util.Arrays;

public class DateOperation {

    public static int getAge(String birthDate) {
        LocalDate birthDay = LocalDate.parse(birthDate); //преобразуем строку с датой рождения в объект LocalDate
        LocalDate currentDate = LocalDate.now();//Получаем текущую дату
        int age = currentDate.getYear() - birthDay.getYear();//вычисляем разницу в годах
        return age;
    }

    public static String[] sortStringDates(String[] dates) {
        LocalDate[] localDates = new LocalDate[dates.length]; // инициализируем массив дат тем же размером, что и массив строк
        for (int i = 0; i < dates.length; i++) {
            localDates[i] = LocalDate.parse(dates[i]);
        }
        Arrays.sort(localDates);
        return null;
        //todo
    }
}

/*
public class DateSort {

    public static String[] sortByDate(String[] strings){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate[] dates = new LocalDate[strings.length];

        for(int i=0;i<strings.length;i++){
            String dateString=strings[i].split(" ")[0]+"-"+strings[i].split(" ")[1]+"-"+strings[i].split(" ")[2];
            LocalDate localDate=LocalDate.parse(dateString,formatter);
            dates[i]=localDate;
        }

        Arrays.sort(dates, Comparator.comparing(LocalDate::getYear));

        String[] sortedStrings=new String[dates.length];
        for(LocalDate date:dates){
            sortedStrings[--j]=date.
 */
