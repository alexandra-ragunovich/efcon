package Collection1.task2;
import java.util.*;

public class Main {
    public static void main(String[] args){
        HeavyBox box1=new HeavyBox(2,3,4);
        HeavyBox box2=new HeavyBox(4,3,10);
        HeavyBox box3=new HeavyBox(4,2,9);
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        int numOfBox = 1;
        for (HeavyBox box : boxes){
            System.out.println("Ящик "+ numOfBox+": Size: " + box.getSize() + ", Weight: " + box.getWeight());
            numOfBox++;
        }
        boxes.get(0).setWeight(1);
        boxes.remove(boxes.size() - 1);


        System.out.printf("\n1 способ\n");
        HeavyBox[] boxArray1 = boxes.toArray(new HeavyBox[0]);
        numOfBox = 1;
        for (HeavyBox box : boxArray1) {
            System.out.println("Ящик "+ numOfBox+": Size: " + box.getSize() + ", Weight: " + box.getWeight());
            numOfBox++;
        }


        System.out.printf("\n2 способ\n");
        HeavyBox[] boxArray2 = new HeavyBox[boxes.size()];
        for (int i = 0; i < boxes.size(); i++) {
            boxArray2[i] = boxes.get(i);
        }
        numOfBox = 1;
        for (HeavyBox box : boxArray2) {
            System.out.println("Ящик "+ numOfBox+": Size: " + box.getSize() + ", Weight: " + box.getWeight());
            numOfBox++;
        }

        System.out.printf("\n3 способ\n");
        HeavyBox[] boxArray3 = boxes.toArray(new HeavyBox[boxes.size()]);
        numOfBox = 1;
        for (HeavyBox box : boxArray3) {
            System.out.println("Ящик "+ numOfBox+": Size: " + box.getSize() + ", Weight: " + box.getWeight());
            numOfBox++;
        }

        boxes.clear();
    }

}
