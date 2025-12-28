package Module3.task8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите сезон (WINTER, SPRING, SUMMER, AUTUMN): ");
        String input = sc.nextLine().trim().toUpperCase();
        Season season = Season.valueOf(input);
        Season next = getNextSeason(season);
        System.out.println("Следующий сезон: " + next);

    }
    public static Season  getNextSeason(Season season){
        Season[] seasons = Season.values();
        int index = season.ordinal();
        int nextIndex = (index + 1) % seasons.length;
        return seasons[nextIndex];
    }
}
enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN

}