package Module10.task1;

public class Main {
    public static void main(String[] args){
        Thread[] tasks = new Thread[10];
for(int i=0; i<tasks.length; i++){
   new Thread(new MyThread(), "MyThread_" + i);
    tasks[i].start();
    try {
        tasks[i].join();
    } catch (InterruptedException ex) {
        System.out.println(ex.getMessage());
    }
}
    }
}
