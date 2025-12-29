package Module4.task2;

public class Type2Strategy implements LearningStrategy {
    @Override
    public void getTime(double talent, int javaTime) {
        double total = (javaTime / talent) * 2;
        double part = total / 2; System.out.println("Тип 2, талант: " + talent);
        System.out.println("Разбор: " + part + " ч, Практика: " + part + " ч, Всего: " + total + " ч");
    }
}