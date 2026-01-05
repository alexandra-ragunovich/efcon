package Collection2.task1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", 1, 1, new int[]{4, 5, 3}));
        students.add(new Student("Мария", 2, 2, new int[]{2, 3, 3}));
        students.add(new Student("Иван", 1, 3, new int[]{5, 4, 4}));
        students.add(new Student("Ольга", 3, 1, new int[]{3, 3, 3}));
        students.add(new Student("Сергей", 2, 2, new int[]{4, 4, 5}));
        students.add(new Student("Анна", 1, 1, new int[]{5, 5, 5}));
        students.add(new Student("Дмитрий", 3, 2, new int[]{2, 2, 2}));
        students.add(new Student("Елена", 2, 3, new int[]{4, 3, 4}));
        students.add(new Student("Павел", 1, 2, new int[]{3, 4, 3}));
        students.add(new Student("Наталья", 3, 3, new int[]{5, 4, 5}));
        students.sort(Comparator.comparing(Student::getGroup) .thenComparing(Student::getAverageGrade));
        for (Student student : students) { System.out.println(student); }
    }
}
