package practice_62;

import java.util.concurrent.Executor;

public class ExecutorExample {

    public static void main(String[] args) {
        Executor executor = command -> new Thread(command).start(); // Executor - может выполнять несколько задач (смотри теорию урок 62)

        executor.execute(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("First task!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executor.execute(() -> System.out.println("Second task!"));
    }
}
