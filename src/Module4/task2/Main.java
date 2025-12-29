package Module4.task2;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int javaTime = 198;
        Student[] students = new Student[9];
        for (int i = 0; i < 3; i++) {
            students[i] = new Student(new Type1Strategy(), 0.1 + random.nextDouble() * 0.9);
            students[i+3] = new Student(new Type2Strategy(), 0.1 + random.nextDouble() * 0.9);
            students[i+6] = new Student(new Type3Strategy(), 0.1 + random.nextDouble() * 0.9);
        }
        for (Student s : students) { s.study(javaTime);
        }
    }
}
