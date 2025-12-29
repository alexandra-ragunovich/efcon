package Module4.task2;

public class Type3Strategy implements LearningStrategy {
    @Override
    public void getTime(double talent, int javaTime) {
        double total = (javaTime / talent) * 3;
        System.out.println("Тип 3, талант: " + talent);
        System.out.println("Практика: " + total + " ч, Всего: " + total + " ч");
    }
}