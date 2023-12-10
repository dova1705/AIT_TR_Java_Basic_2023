package hw_59;

public class hw_59 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            Thread.currentThread().setName("Thread-1");
            Thread.currentThread().setPriority(3);
            while (true) {
                System.out.println(Thread.currentThread().getName() + ", Priority: " + Thread.currentThread().getPriority());
            }
        });

        Thread thread2 = new Thread(() -> {
            Thread.currentThread().setName("Thread-2");
            Thread.currentThread().setPriority(5);
            while (true) {
                System.out.println(Thread.currentThread().getName() + ", Priority: " + Thread.currentThread().getPriority());
            }
        });
        Thread thread3 = new Thread(()->{
            Thread.currentThread().setName("Thread-3");
            Thread.currentThread().setPriority(8);
            while (true) {
                System.out.println(Thread.currentThread().getName() + ", Priority: " + Thread.currentThread().getPriority());
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
