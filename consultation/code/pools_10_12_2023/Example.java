package pools_10_12_2023;

import java.util.concurrent.*;

public class Example {
    public static void main(String[] args) {
        // Создаем пул потоков
        ExecutorService executorService = Executors.newFixedThreadPool(2, new CustomThreadFactory());
        // Отправляем задачу на выполнение
        executorService.execute(new ExceptionThrowingTask());
        // Завершаем работу пула потоков после выполнения всех задач
        executorService.shutdown();
    }

    static class ExceptionThrowingTask implements Runnable {
        @Override
        public void run() {
            throw new RuntimeException("Произошло исключение в потоке!");
        }
    }

    static class CustomThreadFactory implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            // Устанавливаем обработчик не отловленных исключений
            thread.setUncaughtExceptionHandler(new CustomUncaughtExceptionHandler());
            return thread;
        }
    }

    static class CustomUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println("Поток " + t.getName() + " выбросил исключение: " + e.getMessage());
        }
    }
}
