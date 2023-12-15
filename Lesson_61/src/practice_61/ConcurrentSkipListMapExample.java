package practice_61;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {

    public static void main(String[] args) {
        // Создаем карту, которая сортирует ключи в соответствии с natural ordering
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

        // Добавляем элементы
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        // Получаем и печатаем все ключи и значения
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });

        // Примеры использования навигационных методов
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        System.out.println("First entry: " + map.firstEntry());
        System.out.println("Last entry: " + map.lastEntry());

        // Использование методов lowerEntry, floorEntry, ceilingEntry и higherEntry
        System.out.println("Lower entry than 2: " + map.lowerEntry(2)); // меньше чем
        System.out.println("Floor entry than 2: " + map.floorEntry(2)); // меньше или равно
        System.out.println("Ceiling entry than 2: " + map.ceilingEntry(2)); // больше или равно
        System.out.println("Higher entry than 2: " + map.higherEntry(2)); // больше чем

        // Использование методов lowerKey, floorKey, ceilingKey и higherKey
        System.out.println("Lower key than 2: " + map.lowerKey(2)); // меньше чем
        System.out.println("Floor key than 2: " + map.floorKey(2)); // меньше или равно
        System.out.println("Ceiling key than 2: " + map.ceilingKey(2)); // больше или равно
        System.out.println("Higher key than 2: " + map.higherKey(2)); // больше чем

        /*
        Объяснение:
В этом примере создается ConcurrentSkipListMap, которая сортирует ключи (целые числа) согласно их natural ordering.
Добавляются некоторые элементы в карту.
Затем используются методы для печати всех ключей и значений.
Далее используются навигационные методы, такие как lowerEntry, floorEntry, ceilingEntry, и higherEntry,
чтобы найти записи, которые строго меньше, меньше/равно, больше/равно, и строго больше данного ключа соответственно.
Также используются аналогичные методы только для ключей.
Имейте в виду, что null значения или ключи не допускаются в ConcurrentSkipListMap.
Этот код иллюстрирует базовое использование ConcurrentSkipListMap, показывая,
как элементы упорядочиваются и как использовать различные навигационные методы, которые предоставляет карта.
         */
    }
}
