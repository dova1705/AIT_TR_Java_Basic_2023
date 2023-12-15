package practice_62;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomThreadFactoryExample {
    public static void main(String[] args) {
        // Создаем фабрику потоков с кастомной конфигурацией
        ThreadFactory customThreadFactory = new ThreadFactory() {
            private final AtomicInteger threadNumber = new AtomicInteger(1);

            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                // Устанавливаем имя потока
                thread.setName("MyCustomThread-" + threadNumber.getAndIncrement());
                // Устанавливаем приоритет потока
                thread.setPriority(Thread.MAX_PRIORITY);
                // Устанавливаем обработчик необработанных исключений
                thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println("Необработанное исключение в потоке: " + t.getName());
                        e.printStackTrace();
                    }
                });
                return thread;
            }
        };

        // Создаем исполнителя с пулом потоков, используя нашу кастомную фабрику потоков
        ExecutorService executor = new ThreadPoolExecutor(
                2, // основной размер пула
                4, // максимальный размер пула
                60, // время удержания потока
                TimeUnit.SECONDS, // единицы измерения времени удержания
                new LinkedBlockingQueue<>(), // очередь задач
                customThreadFactory // наша кастомная фабрика потоков
        );

        // Отправляем задачу на выполнение
        executor.submit(() -> {
            System.out.println("Выполнение задачи в: " + Thread.currentThread().getName());
            throw new RuntimeException("Ой! Произошло исключение.");
        });

        // Останавливаем исполнителя после выполнения всех представленных задач
        executor.shutdown();
    }
}
