package practice_59;

public class StudentCode {
    public static void main(String[] args) throws InterruptedException {
       // tryDemonThread();
        trySetThreadName();

    }
    public static void trySetThreadName() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setName("Dova!!!");
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread() {
            public void run() {
                Thread.currentThread().setName("child thread");
                System.out.println("child thread getName(): " + Thread.currentThread().getName());
                System.out.println("child thread getPriority(): " + Thread.currentThread().getPriority());
            }
        };
        thread.sleep(1000);
        thread.start();

        System.out.println("child thread thread.getName() (from main): " + thread.getName());
    }

    static void tryDemonThread(){
        Thread nonDaemonThread = new Thread(() -> {
            try {
                System.out.println("Non-daemon thread starting work.");
                // Эмулируем долгую работу потока, например, обработку данных
                Thread.sleep(5000); // Ожидаем 5 секунд
                System.out.println("Non-daemon thread finished work.");
            } catch (InterruptedException e) {
                System.err.println("Non-daemon thread was interrupted.");
            }
        });

        Thread daemonThread = new Thread(() -> {
            try {
                System.out.println("Daemon thread starting work.");
                // Эмулируем долгую работу потока
                while (true) {
                    System.out.println("Daemon thread is working...");
                    Thread.sleep(1000); // Ожидаем 1 секунду
                }
            } catch (InterruptedException e) {
                System.err.println("Daemon thread was interrupted.");
            }
        });
        // Устанавливаем поток как демон
        daemonThread.setDaemon(true);

        nonDaemonThread.start();
        daemonThread.start();
    }
}
