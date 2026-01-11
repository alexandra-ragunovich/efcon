package Module10.task3;
import java.util.Random;

public class Producer implements Runnable {
    private final BoundedQueue queue;
    private final Random random = new Random();

    public Producer(BoundedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (!queue.isFinished()) {
                int value = random.nextInt(100) + 1; // 1..100
                queue.produce(value);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
