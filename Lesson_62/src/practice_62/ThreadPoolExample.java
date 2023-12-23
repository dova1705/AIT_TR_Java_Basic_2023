package practice_62;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {
        // Получаем количество доступных процессорных ядер
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("количество ядер: " + coreCount);

        // Создаем пул потоков, в котором количество потоков равно количеству процессорных ядер
        ExecutorService executorService = Executors.newFixedThreadPool(coreCount);

        // Отправляем задачи на выполнение в пул потоков
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Task());
        }

        // Останавливаем пул потоков, когда все задачи будут выполнены
        executorService.shutdown();
    }

    // Пример задачи для выполнения
    static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("Task executed by " + Thread.currentThread().getName());
        }
    }
}