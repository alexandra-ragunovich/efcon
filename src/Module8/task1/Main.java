package Module8.task1;
import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Double> arr = new ArrayList();
        for (double i=1; i<=20;i++){
         if(i%2==0){
             arr.add(i);
         }

        }
        arr.stream().forEach(n->System.out.println(n+" in"));
        System.out.println();
        arr.stream().map(n->n=n*2.54).forEach(n->System.out.println(n+" cm"));
    }
}
