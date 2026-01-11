package Module10.task3;

public class Consumer implements Runnable {
    private final BoundedQueue queue;

    public Consumer(BoundedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (!queue.isFinished()) {
                Integer value = queue.consume();
                if (value == null) break;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
