package Module3.task1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = sc.nextLine();
        int count = 0;
        Pattern pattern=Pattern.compile("\\p{P}");
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            count++;
        }
        System.out.print("Количество знаков препинания:"+count);
    }
}
