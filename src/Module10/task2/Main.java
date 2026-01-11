package Module10.task2;

public class Main {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();
    private static final Object resource3 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource1");
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource2");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource2");
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                    synchronized (resource3) {
                        System.out.println("Thread 2: locked resource3");
                    }
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource3) {
                    System.out.println("Thread 3: locked resource3");
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                    synchronized (resource1) {
                        System.out.println("Thread 3: locked resource1");
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
