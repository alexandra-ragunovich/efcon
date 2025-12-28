package Module3.task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = sc.nextLine();
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(String word: words){
            word = word.replaceAll("[^a-zA-Zа-яА-Я]", "");
            if (!word.isEmpty()){
                result.append(word.charAt(word.length()-1));
            }
        }
        System.out.print("Результат:\n"+result);
    }
}
