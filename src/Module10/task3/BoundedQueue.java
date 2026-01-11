package Module10.task3;
import java.util.LinkedList;
import java.util.Queue;

public class BoundedQueue {

    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;
    private int processedCount = 0;
    private final int maxProcessed;

    public BoundedQueue(int capacity, int maxProcessed) {
        this.capacity = capacity;
        this.maxProcessed = maxProcessed;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() >= 100) {
            wait();
        }
        if (processedCount >= maxProcessed) return;

        queue.add(value);
        System.out.println(Thread.currentThread().getName() + " produced: " + value + " | Queue size: " + queue.size());
        notifyAll();
    }

    public synchronized Integer consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        if (processedCount >= maxProcessed) return null;

        int value = queue.poll();
        processedCount++;
        System.out.println(Thread.currentThread().getName() + " consumed: " + value + " | Processed: " + processedCount + " | Queue size: " + queue.size());

        if (queue.size() <= 80) {
            notifyAll();
        }
        return value;
    }

    public synchronized boolean isFinished() {
        return processedCount >= maxProcessed;
    }
}