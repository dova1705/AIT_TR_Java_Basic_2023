package thread_10_05_2023;

public class Consultation {
    public static void main(String[] args) throws InterruptedException {
        Consultation tasks = new Consultation();
        //       tasks.task1();
        //      tasks.task2();
        tasks.task3();
//        tasks.task4();
//        tasks.task5();
    }

    // Задача 1: Создание и старт двух потоков
    public void task1() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Thread-1");
                System.out.println(Thread.currentThread().getName());
            }

        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Thread-2");
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread1.start();
        thread2.start();
        Thread.sleep(1000); //основной поток main

        System.out.println("============================");
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());


    }

    // Задача 2: Использование метода sleep()
    public void task2() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("поток проснулся ");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        System.out.println(thread.isInterrupted());
    }

    // Задача 3: Установка и получение приоритета потока. Создайте поток, установите для него максимально возможный
    // приоритет. Выведите на экран "Task 3: Thread Priority: ..."

    public void task3() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Task 3: Thread Priority: ");
            }
        });

        thread.start();
        thread.setPriority(3);
        //Thread.sleep(1000); //поток спит 1 секунду
        try {
            thread.join(); //ожидание завершение потока
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread.getName() + thread.getPriority());
    }

    // Задача 4: Использование join() для ожидания завершения потока. Создайте поток, который печатает числа от 1 до 5
    // с интервалом в 1с, главный поток должен дождаться выполнения этого потока
    public void task4() {
        Thread thread = null;

        thread.start();


        System.out.println("Task 4: Thread has finished execution");
    }

    // Задача 5: Использование потока-демона. Создайте демон-поток, который каждые 500 мс печатает в консоль
    // "Task 5: Daemon Thread is running", дайте поработать данному потоку 2 секунды, потом завршите выполнение
    // главного потока
    public void task5() {
        Thread daemonThread = null;

        daemonThread.start();

        // Позволим демону поработать 2 секунды перед завершением основного потока

        System.out.println("Task 5: Main Thread is finishing and daemon will be terminated");
    }

    // Задача 6: создайте 2 потока 1.поток - демон, который 10 раз выводи в консоль "Daemon Thread is running", засыпая
    // на 1 секунду каждый раз. Второй поток должен проделать аналогичную работу, но 5 раз и выводить сообщение
    // "Non Daemon Thread is running" и остановить свое выполнение. В потоке мейн следует проверить, работает ли
    // поток-демон, если да, то остановить его, если нет, то просто закончить работу.

    public void task6() {
        Thread daemonThread = null;
        Thread nonDaemonThread = null;

        daemonThread.start();
        nonDaemonThread.start();
    }
}
