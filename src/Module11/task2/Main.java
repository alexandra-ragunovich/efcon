package Module11.task2;
import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args){
        HelloWorld helloWorld = new HelloWorld();
        try {
            Method method = helloWorld.getClass().getDeclaredMethod("printHelloWorld");
            method.setAccessible(true);
            method.invoke(helloWorld);
        } catch (Exception  e) {
            System.out.println(e.getMessage());
        }
    }
}
