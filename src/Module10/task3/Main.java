package Module10.task3;

public class Main {
    public static void main(String[] args) {
        BoundedQueue queue = new BoundedQueue(200, 10000);

        for (int i = 1; i <= 3; i++) {
            new Thread(new Producer(queue), "Producer-" + i).start();
        }

        for (int i = 1; i <= 2; i++) {
            new Thread(new Consumer(queue), "Consumer-" + i).start();
        }
    }
}
