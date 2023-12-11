package practice_61;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityExample {

    public static void main(String[] args) {
        // Создание очереди с использованием natural ordering
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        // Добавление элементов
        queue.put(3);
        queue.put(1);
        queue.put(2);

        // Получение элементов в порядке приоритета
        System.out.println(queue.poll()); // 1
        System.out.println(queue.poll()); // 2
        System.out.println(queue.poll()); // 3
    }
}
