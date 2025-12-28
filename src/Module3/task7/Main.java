package Module3.task7;

public class Main {
    public static void main(String[] args){
        for (Season season : Season.values()) {
            System.out.println("Описание "+season+":"+season.getDescription()+", Количество дней:"+season.getCountOfDays());
        }
    }
}
enum Season {
    WINTER("Зима — холодное время года", 90),
    SPRING("Весна — пробуждение природы", 92),
    SUMMER("Лето — жаркое и солнечное время", 92),
    AUTUMN("Осень — время урожая и листопада", 91);
    private  String description;
    private  int countOfDays;
    Season(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }
    public String getDescription() {
        return description;
    }
    public int getCountOfDays() {
        return countOfDays;
    }

}
