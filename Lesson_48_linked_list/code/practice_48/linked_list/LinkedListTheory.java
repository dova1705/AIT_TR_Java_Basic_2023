package practice_48.linked_list;

import practice_48.city_bus.BusStopNode;

public class LinkedListTheory {
    // разбор LinkedListTheory
    public static void main(String[] args) {
        //остановки
        BusStopNode berlin = new BusStopNode("Berlin");
        BusStopNode munich = new BusStopNode("Munich");
        BusStopNode nuremberg = new BusStopNode("Nuremberg");
        BusStopNode stuttgart = new BusStopNode("Stuttgart");
        BusStopNode koln = new BusStopNode("Koln");

        //установили след остановку для Берлин setNext(nuremberg)
        berlin.setNext(nuremberg); // Берлин -> след остановка Нюрнберг

        //установили след остановку для Нюрнберг setNext(munich)
        nuremberg.setNext(munich); // Нюрнберг -> след остановка Мюнхен

        munich.setNext(stuttgart); // Мюнхен ->след остановка Штутгарт
        stuttgart.setNext(koln); //Штутгарт -> след остановка Кёльн

//        BusStopNode node = berlin;
//        for (int i = 0; i < 4; i++) {
//            System.out.println(node.getStopName());
//            node = node.getNext();
//        }
        BusStopNode node = berlin;
        while (node != null){
            System.out.println(node.getStopName()); //начало маршрута
            node = node.getNext(); //остановки по маршруту
        }



        //пример класса не обязательный к применению
        class Node{
            Object data; // данные
            Node next; // ссылка на следующую ноду
        }

        // [0][2][3][4]

        // LinkedListTheory.size() ->количество нод в цепи
        // index:       0                   1                   2                              n
        // null <- [ul Pushkina] <-> [Prospekt Mira] <-> [ul Nezawisimosti] <-> ...... <-> [ul N-aya] -> null
        //              |                 |                     |                               |
        //            посуда            одежда                книги                          техника

    }
}

