package practice_63;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Classwork {

    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Classwork cw = new Classwork();
//        cw.task1AtomicInteger();
//        cw.task2AtomicArray();
//        cw.task3CopyOnWriteArrayList();
//        cw.task4ConcurrentHashMap();
        cw.task5BlockingQueue();
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
                    count++; //объявлен наверху после имени класса
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
    } // end task2

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
    } // end task3

    // Задача 4: Использование ConcurrentHashMap для хранения и извлечения пар ключ-значение в многопоточной среде.
    void task4ConcurrentHashMap() throws InterruptedException {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        //  Создайте сценарий, где несколько потоков добавляют, удаляют и читают пары ключ-значение одновременно,
        // не используя явные блокировки.

        Thread thread1 = new Thread(() -> {
            Thread.currentThread().setName("Мургап");
            for (int i = 0; i < 1000; i++) {
                String key = Thread.currentThread().getName() + " " + i;
                String value = Thread.currentThread().getName();
                map.put(key, value);
            }
        });

        Thread thread2 = new Thread(() -> {
            Thread.currentThread().setName("Мерв");
            for (int i = 0; i < 1000; i++) {
                String key = Thread.currentThread().getName() + " " + i;
                String value = Thread.currentThread().getName();
                map.put(key, value);
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(map.size());
    }


    // Задача 5: Использование BlockingQueue для потокобезопасного добавления и извлечения объектов.
    void task5BlockingQueue() throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        // Создайте производителя, который помещает объекты в очередь, и потребителя, который извлекает объекты из
        // очереди. Убедитесь, что потребитель может консумировать объекты правильно, даже если производитель добавляет их в
        // произвольные моменты времени.

        Thread thread1 = new Thread(() -> {
            Thread.currentThread().setName("Мир");
            for (int i = 0; i < 10; i++) {
                queue.add(Thread.currentThread().getName() + "-" + i);
                try {
                    Thread.sleep(new Random().nextInt(500,2000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            Thread.currentThread().setName("небо");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "-" + i);
                try {
                    System.out.println(queue.take());
                    if (queue.isEmpty()){
                        Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        t2.start();
        thread1.join();
        t2.join();
    }
}