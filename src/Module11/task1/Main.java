package Module11.task1;
import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args){
        Man man = new Man("Alex", "Ivanov", 25,"Developer");
        print(man);

    }
    public static void print(Object man){
        try {
            Method method = man.getClass().getDeclaredMethod("printInfo");
            method.setAccessible(true);
            method.invoke(man);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
