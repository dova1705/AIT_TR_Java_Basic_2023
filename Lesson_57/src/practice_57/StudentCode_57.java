package practice_57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentCode_57 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "cherry", null);
        List<Integer> output = new ArrayList<>();

//        for (String s : input) {
//            output.add(s.length());
//        }

        // 1. запускаем поток данных
        input.stream()
                // 2. Выбор конвейерной операции. То как будет проходить перебор элементов в коллекции
                // выполняем конвейерную операцию!!! Любую подходящую

                .filter(i -> i != null) // условие прохождения элемента на дальнейшую обработку, в данном случае элемент не должен быть равен null
                .map(String::length) // ссылка на метод length, то есть будет выполняться метод length из класса String
                                     // для каждого отдельного элемента в потоке, после чего результат выполнения этого метода пойдет дальше

                //.map(i -> i.length()) // прямой вызов метода .length() класса строк, то есть мы говорим, что для каждого элемента "i"
                                        // следует вызвать метод .length()

                // мы можем также использовать mapToInt так как мы будем работать в дальнейшем с целыми числами:
                //.mapToInt(String::length)
                //.mapToInt(i -> i.length())

                // после конвейерной операции обязательно должна стоять терминальная, тк без терминальной поток банально не запустится
                //.collect(Collectors.toList()); // добавит все результаты в новый лист и вернет его
                //.toArray(Integer::new); //добавит все результаты в новый массив и вернет его (нужен цикл для добавления)
                .forEach(i -> output.add(i)); // выполнит операцию для каждого элемента, в данном случае операция будет "output.add(i)"
                //.forEach(output::add); // выполнит операцию add в output для каждого элемента,
                                       // но в отличие от строки выше сделает это через ссылку, ане через прямой вызов метода add

        System.out.println(output);
    }
}
