package hw_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamHw_56 {
    public static void main(String[] args) {

        // Исходный список
        List<Integer> input = Arrays.asList(1,2,3,4,5);

        // Использование Stream API для фильтрации четных чисел
        List<Integer> output = new ArrayList<>();
        output = input.stream()
                .filter(i -> i % 2 == 0) // фильтрует поток, пропуская дальше только те элементы, которые удовлетворяют условию (четные числа)
                .collect(Collectors.toList()); // собирает результат в новый список

        System.out.println(output);



        // Преобразование элементов:
        // Исходный список
        List<String> input2 = Arrays.asList("apple", "banana", "cherry");

        // Использование Stream API для преобразования строк в их длины
        List<Integer> output2 = input2.stream()
                .map(String::length)  // преобразует каждую строку в ее длину
                .collect(Collectors.toList());  // собирает результат в новый список


        // Подсчет элементов, удовлетворяющих условию:
        // Исходный список
        List<Integer> input3 = Arrays.asList(1, 2, 3, 4, 5);

        // Использование Stream API для подсчета четных чисел
        long count = input3.stream()
                .filter(i -> i % 2 == 0)  // фильтрует поток, пропуская дальше только те элементы, которые удовлетворяют условию (четные числа)
                .count();  // подсчитывает количество элементов в потоке после фильтрации
    }
}
