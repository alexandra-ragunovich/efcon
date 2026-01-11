package Module10.task1;

public class MyThread  extends Thread{
    MyThread(){
        super();

    }
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println("Название потока: "+ name);
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }

}
