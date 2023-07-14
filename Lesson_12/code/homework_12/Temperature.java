public class Temperature {
    public static void main(String[] args) {
        //Собрать в массив данные о дневной температуре в вашем городе за прошедшую неделю.
        // Выведите на печать температуру, которая была во вторник и затем в четверг.
        // Найти среднюю температуру за прошлую неделю.

        int[] t = {28, 29, 24, 26, 25, 23, 25};
        int l = t.length;//длина массива
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum = (sum + t[i]);
        }
        int average = sum / t.length;

        System.out.println("средняя температура " + average + "\u00B0");
        System.out.println("вторник " + t[1] + "\u00B0");
        System.out.println("четверг " + t[3] + "\u00B0");

    }
}




