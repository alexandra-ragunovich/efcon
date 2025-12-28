package Module3.task9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите сезон (WINTER, SPRING, SUMMER, AUTUMN): ");
        String input = sc.nextLine().trim().toUpperCase();
        Season season = Season.valueOf(input);
        printDaysInSeason(season);
    }
    public static void printDaysInSeason(Season season){
        System.out.println("В сезоне " + season + " " + season.getCountOfDays() + " дней.");
    }
}
enum Season {
    WINTER(90),
    SPRING(92),
    SUMMER(92),
    AUTUMN( 91);

    private  int countOfDays;
    Season( int countOfDays) {
       this.countOfDays = countOfDays;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
}