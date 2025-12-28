package Module3.task4;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введие строку\n");
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("[A-Za-zА-Яа-яЁё]+");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.print("Количество входящих слов\n"+count);
    }
}