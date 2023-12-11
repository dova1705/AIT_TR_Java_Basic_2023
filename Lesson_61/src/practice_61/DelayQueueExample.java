package practice_61;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private final long startTime;
    private final String name;

    public DelayedElement(long delayInSeconds, String name) {
        this.startTime = System.currentTimeMillis() + delayInSeconds * 1000;
        this.name = name;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.startTime < ((DelayedElement) o).startTime) {
            return -1;
        }
        if (this.startTime > ((DelayedElement) o).startTime) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return name + " with delay: " + startTime;
    }
}

public class DelayQueueExample {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();

        queue.put(new DelayedElement(3, "Element1")); // задержка 3 секунды
        queue.put(new DelayedElement(5, "Element2")); // задержка 5 секунд
        queue.put(new DelayedElement(1, "Element3")); // задержка 1 секунда

        while (!queue.isEmpty()) {
            DelayedElement element = queue.take();
            System.out.println("Removed element: " + element);
        }
    }
}