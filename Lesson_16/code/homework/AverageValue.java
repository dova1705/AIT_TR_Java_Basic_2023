package homework;

public class AverageValue {
    public static void main(String[] args) {


        //Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
        // Найдите среднюю величину по всем элементам массива с четными индексами.

        int[] array = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};

        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            // Проверяем, является ли индекс четным
            if (i % 2 == 0) {
                sum = sum + array[i]; // Добавляем значение элемента к сумме
                count++; // Увеличиваем счетчик элементов
            }
        }
        double average = (double) sum / count; // Вычисляем среднее значение
        System.out.println("Средняя величина по элементам с четными индексами: " + average);


    }
}
