package Module3.task5;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = sc.nextLine();
        Pattern pattern=Pattern.compile("<p[^>]*>");
        Matcher matcher= pattern.matcher(text);
        String result= matcher.replaceAll("<p>");
        System.out.println("Результат: " + result);
    }
}
