package Collection1.task1;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = sc.nextLine();
        String[] text=input.split(",");
        for (int i = 0; i < text.length; i++)
        {
            text[i] = text[i].trim();
        }
        List <Integer> numbers= new ArrayList<>();
        for (int i = 0; i < text.length; i++)
        {
           int num = Integer.parseInt(text[i]);
           numbers.add(num);
        }
        Set<Integer> result = new HashSet<>(numbers);
        System.out.print(result);

    }
}
