package practice_61;

import java.util.concurrent.atomic.AtomicLong;

class Counter {
    private final AtomicLong value = new AtomicLong(0);  // Изначальное значение


    public void increment() {
        long oldValue, newValue;
        do {
            oldValue = value.get();  // Получаем текущее значение
            newValue = oldValue + 1;  // Увеличиваем его на 1
        } while (!value.compareAndSet(oldValue, newValue));  // Пытаемся установить новое значение. Если текущее значение не равно oldValue, начинаем сначала

    }

    public long getValue() {
        return value.get();

    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String str = "abc";
        str.replace("abc", "cba");
        System.out.println(str);

//        Counter counter = new Counter();
//
//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 10_000; i++) {
//                counter.increment();
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 10_000; i++) {
//                counter.increment();
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println("Final counter value: " + counter.getValue());  // Выводит 2000, если все инкременты прошли успешно
    }
}
