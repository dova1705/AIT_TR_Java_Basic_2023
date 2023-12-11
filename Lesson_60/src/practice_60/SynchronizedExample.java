package practice_60;

public class SynchronizedExample {

    // Объект для блокировки в примере synchronized блока
    private final Object lockObject = new Object();

    // Простой счетчик
    private int count = 0;

    // Пример использования synchronized метода
    public synchronized void incrementSyncMethod() {
        count++;
        System.out.println(Thread.currentThread().getName() + " - Sync Method, Count: " + count);
    }

    // Пример использования synchronized блока с объектом this
    public void incrementSyncThis() {
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName() + " - Sync This, Count: " + count);
        }
    }

    // Пример использования synchronized блока с отдельным объектом блокировки
    public void incrementSyncObject() {
        synchronized (lockObject) {
            count++;
            System.out.println(Thread.currentThread().getName() + " - Sync Object, Count: " + count);
        }
    }

    // Пример использования synchronized на статическом методе
    public static synchronized void staticSyncMethod() {
        System.out.println(Thread.currentThread().getName() + " - Static Sync Method");
    }

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        // Создаем и запускаем потоки
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.incrementSyncMethod();
                example.incrementSyncThis();
                example.incrementSyncObject();
                SynchronizedExample.staticSyncMethod();
            }
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.incrementSyncMethod();
                example.incrementSyncThis();
                example.incrementSyncObject();
                SynchronizedExample.staticSyncMethod();
            }
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}