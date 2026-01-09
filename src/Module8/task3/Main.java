package Module8.task3;
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество целых чисел в коллекции: ");
        int n = in.nextInt();

        System.out.print("Введите минимальный элемент: ");
        int minValue = in.nextInt();

        System.out.print("Введите максимальнй элемент: ");
        int maxValue = in.nextInt();
        List<Integer> arr=new ArrayList<>();
        for (int i=1; i<n;i++){
            arr.add(new Random().nextInt(maxValue - minValue + 1) + minValue);
        }
        System.out.println("Сгенерированная коллекция: " + arr);
        boolean result=arr.stream().anyMatch(x -> x % 3 == 0 && x % 5 == 0);
        System.out.println("Есть ли числа, делящиеся на 3 и 5? " + result);
    }
}
