package practice_61;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    private static final AtomicInteger atomicInt = new AtomicInteger(1);

    public static void main(String[] args) {
        // Пример использования метода get():
        // вернет текущее значение
        System.out.println("Initial Value: " + atomicInt.get());

        // Пример использования метода addAndGet(int delta):
        // прибавит число из аргумента и вернет текущее значение
        System.out.println("Add 5: " + atomicInt.addAndGet(5));

        // Пример использования метода getAndAdd(int delta):
        // сначала вернет старое значение, затем прибавит
        System.out.println("Add 3 and get old value: " + atomicInt.getAndAdd(3));

        // Пример использования метода incrementAndGet():
        // увеличит на 1, вернет текущее значение
        System.out.println("Increment and get new value: " + atomicInt.incrementAndGet());

        // Пример использования метода getAndIncrement():
        // увеличит на 1, вернет старое значение
        System.out.println("Increment and get old value: " + atomicInt.getAndIncrement());

        // Пример использования метода compareAndSet(int expect, int update):
        // попытается установить новое значение, если старое значение совпадает с текущим expectedValue, вернет true/false
        boolean isSet = atomicInt.compareAndSet(9, 10); // Сравнивает текущее значение с ожидаемым и, если они равны, устанавливает новое значение
        System.out.println("Compare and set successful: " + isSet + " | Value: " + atomicInt.get());

        // Пример использования метода decrementAndGet():
        // уменьшит текущее значение и вернет новое
        System.out.println("Decrement and get new value: " + atomicInt.decrementAndGet());

        // Пример использования метода getAndDecrement():
        // уменьшит текущее значение и вернет старое
        System.out.println("Decrement and get old value: " + atomicInt.getAndDecrement());

        // Пример использования метода getAndSet(int newValue):
        // установит новое значение и вернет старое
        System.out.println("Set to 100 and get old value: " + atomicInt.getAndSet(100));

        // умножение на 2
        System.out.println("Умножение на 2: " + atomicInt.updateAndGet(x -> x * 2));

        // Финальное значение:
        System.out.println("Final Value: " + atomicInt.get());
    }
}

