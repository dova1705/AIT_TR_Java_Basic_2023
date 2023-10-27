package practice_48.linked_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // примеры работы LinkedListTest
        ArrayList<String> arrayList = new ArrayList<>();


        // в LinkedListTest 2 конструктора - пустой и который принимает экземпляр класса collections
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        // "one" -> "two" -> "three"

        linkedList.get(1); // two

        linkedList.add(1, "four"); // "one" -> "four" -> "two" -> "three"
        linkedList.set(1,"Five"); // "one" -> "five" -> "two" -> "three"
        linkedList.size(); //вернет количество элементов в листе (число)

        linkedList.add("Four"); // "one" -> "five" -> "two" -> "three" -> "four"
        linkedList.add("three"); // "one" -> "five" -> "two" -> "three" -> "four" -> "three"
        // удаляет первое вхождение элемента в массиве:
        linkedList.remove("three"); // "one" -> "five" -> "two" -> "four" -> "three"

        linkedList.add(3,"three"); // "one" -> "five" -> "two" -> "three" -> "four" -> "three"

        //удаляет элемент по индексу
        linkedList.remove(5); // "one" -> "five" -> "two" -> "three" -> "four"

        linkedList.removeLast(); // удаляет последний элемент
        linkedList.removeFirst(); // удаляет первый элемент

        linkedList.removeFirstOccurrence("erg"); //удаляет первое вхождение данного объекта
        linkedList.removeLastOccurrence("erg"); //удаляет последнее вхождение данного объекта

        linkedList.addAll(arrayList); // позволяет добавить коллекцию

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }


        // arrayList [one][two][three] .add(1, "four") ->
        // [one][two][three][] -> [one][two][][three] -> [one][][two][three] ->[one][four][two][three]
    }

}
