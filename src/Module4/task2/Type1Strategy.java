package Module4.task2;

public class Type1Strategy implements LearningStrategy{
    public void getTime(double talent, int javaTime) {
        double total = javaTime / talent;
        double part = total / 3;
        System.out.println("Тип 1, талант: " + talent);
        System.out.println("Разбор: " + part + " ч, Практика: " + part + " ч, Поток: " + part + " ч, Всего: " + total + " ч"); }
}
