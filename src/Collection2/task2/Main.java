package Collection2.task2;
import java.util.*;

public class Main {
    public static void main(String[] args){
        TreeSet<HeavyBox> boxes = new TreeSet<>();
        boxes.add(new HeavyBox(10, 10,20));
        boxes.add(new HeavyBox(5, 15,20));
        boxes.add(new HeavyBox(10, 20, 10));
        boxes.add(new HeavyBox(7, 25,35));
        boxes.add(new HeavyBox(5, 30,44));
        for (HeavyBox box : boxes) { System.out.println(box); }
    }
}
