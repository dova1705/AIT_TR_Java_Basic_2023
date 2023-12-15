package pools_10_12_2023;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class Classwork {
    static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        Classwork cw = new Classwork();
//        cw.task1AtomicInteger();
//        cw.task2AtomicArray();
        cw.task3CopyOnWriteArrayList();
//        cw.task4ConcurrentHashMap();
//        cw.task5BlockingQueue();
    }

    // Задача 1: Использование AtomicInteger для инкремента и декремента значения в многопоточной среде.
    void task1AtomicInteger() {
        AtomicInteger atomicInt = new AtomicInteger(0);

        // Создайте несколько потоков, которые будут инкрементировать и декрементировать значение atomicInt.
        // Убедитесь, что обновленное значение является правильным, после выполнения всех потоков.
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    atomicInt.incrementAndGet();
                    count++; //объявлен в 7-й строке
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3000; i++) {
                    atomicInt.decrementAndGet();
                    count--;
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(atomicInt.get());
        System.out.println(count);

    } // end task1

    // Задача 2: Использование AtomicReferenceArray для управления массивом объектов в многопоточной среде.
    void task2AtomicArray() throws InterruptedException {
        AtomicReferenceArray<String> atomicArray = new AtomicReferenceArray<>(10);

        // Создайте потоки, которые будут изменять различные индексы atomicArray и убедитесь, что чтение данных
        // происходит корректно.

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                Thread.currentThread().setName("поток-1");
                for (int i = 0; i < atomicArray.length(); i++) {
                    atomicArray.set(i, Thread.currentThread().getName());
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                Thread.currentThread().setName("поток-2");
                for (int i = 0; i < atomicArray.length(); i++) {
                    atomicArray.set(i, Thread.currentThread().getName());
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        for (int i = 0; i < atomicArray.length(); i++) {
            System.out.println(atomicArray.get(i));
        }
    }

    // Задача 3: Использование CopyOnWriteArrayList для безопасной записи во время итерирования.
    void task3CopyOnWriteArrayList() throws InterruptedException {
        CopyOnWriteArrayList<String> listCW = new CopyOnWriteArrayList<>();
        ArrayList<String> listAL = new ArrayList<>();

        // Придумайте сценарий, где несколько потоков читают и пишут в список одновременно.

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Rambo");
                for (int i = 0; i < 5000; i++) {
                    listCW.add(Thread.currentThread().getName());
                    listAL.add(Thread.currentThread().getName());
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Stallone");
                for (int i = 0; i < 5000; i++) {
                    listCW.add(Thread.currentThread().getName());
                    listAL.add(Thread.currentThread().getName());
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("CopyOnWriteArrayList: " + listCW.size());
        System.out.println("ArrayList: " + listAL.size());
    }

    // Задача 4: Использование ConcurrentHashMap для хранения и извлечения пар ключ-значение в многопоточной среде.
    void task4ConcurrentHashMap() {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        //  Создайте сценарий, где несколько потоков добавляют, удаляют и читают пары ключ-значение одновременно,
        // не используя явные блокировки.
    }

    // Задача 5: Использование BlockingQueue для потокобезопасного добавления и извлечения объектов.
    void task5BlockingQueue() {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        // Создайте производителя, который помещает объекты в очередь, и потребителя, который извлекает объекты из
        // очереди. Убедитесь, что потребитель может консумировать объекты правильно, даже если производитель добавляет их в
        // произвольные моменты времени.
    }
}
