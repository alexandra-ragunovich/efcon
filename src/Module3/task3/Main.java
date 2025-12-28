package Module3.task3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Введие строку\n");
        String text = sc.nextLine();
        Pattern pattern=Pattern.compile("0[xX][0-9a-fA-F]+");
        Matcher matcher=pattern.matcher(text);
        System.out.println("Найденные шестнадцатеричные числа:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
