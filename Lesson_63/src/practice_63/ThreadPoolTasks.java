package practice_63;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTasks {

    /**
     * Задача 1: Создание пула потоков и выполнение задачи
     *
     * Задача: Создайте пул потоков и выполните в нем простую задачу, которая выводит в консоль "Hello, World!".
     */
    public static void task1() {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Запуск задачи в пуле потоков
//        executor.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello, World");
//            }
//        });

        executor.execute(() -> {
            System.out.println("Hello");
            System.out.println("World");
        }); // Сокращенный код с 16 до 21 строки. (это одно и тоже)
     //   executor.execute(() -> System.out.println("World")); // Сокращенный код с 16 до 21 строки. (это одно и тоже)

        // Завершение пула потоков
        executor.shutdown();

    }

    /**
     * Задача 2: Ожидание завершения всех задач
     *
     * Задача: Создайте пул потоков и запустите в нем несколько задач.
     * Дождитесь, пока все они не будут выполнены, и только потом продолжите выполнение основного потока.
     */
    public static void task2() throws InterruptedException {
        // Ваш код здесь
        // Создание пула потоков с тремя потоками
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Запуск нескольких задач в пуле потоков
        Future<?> f1 = executor.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Java");
        });

        Future<?> f2 = executor.submit(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("AIT");
        });

        Future<?> f3 = executor.submit(() -> {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Programming");
        });

        while (!(f1.isDone() && f2.isDone() && f3.isDone())) { // executor ждет
            Thread.sleep(1000);
            System.out.println("Still waiting");
        }

        // Завершение пула потоков и ожидание завершения всех задач
        executor.shutdown();

    }

    /**
     * Задача 3: Получение результатов из Future
     *
     * Задача: Создайте пул потоков и запустите в нем задачу, которая возвращает результат.
     * Получите результат выполнения задачи из объекта Future и выведите его в консоль.
     */
    public static void task3() {
        // Ваш код здесь
    }

    /**
     * Задача 4: Ограничение количества потоков в пуле
     *
     * Задача: Создайте пул потоков с фиксированным числом потоков и запустите в нем больше задач, чем потоков.
     * Обратите внимание, как задачи выполняются (последовательно или параллельно).
     */
    public static void task4() {
        // Ваш код здесь
    }

    /**
     * Задача 5: Обработка исключений в потоках пула
     *
     * Задача: Создайте пул потоков и запустите в нем задачу, которая генерирует исключение.
     * Реализуйте механизм, который позволяет корректно обрабатывать исключения, возникшие в потоках пула.
     */
    public static void task5() {
        // Ваш код здесь
    }

    public static void main(String[] args) throws InterruptedException {
//        task1();
        task2();
//        task3();
//        task4();
//        task5();
    }
}
