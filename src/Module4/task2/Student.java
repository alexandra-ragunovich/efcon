package Module4.task2;

public class Student {
    private LearningStrategy strategy;
    private double talent;
    public Student(LearningStrategy strategy, double talent) {
        this.strategy = strategy;
        this.talent = talent;
    }
    public void study(int javaTime) {
        strategy.getTime(talent, javaTime);
        System.out.println("----------------------");
    }
}
