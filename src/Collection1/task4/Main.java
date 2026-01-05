package Collection1.task4;
import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", 101, 1, new int[]{4, 5, 3}));
        students.add(new Student("Мария", 102, 2, new int[]{2, 2, 3}));
        students.add(new Student("Иван", 101, 3, new int[]{5, 4, 4}));
        students.add(new Student("Ольга", 103, 1, new int[]{3, 2, 3}));
        updateStudents(students);
        printStudents(students, 2);
    }
    public static void updateStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты курса " + course + ":");
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getFirstName());
            }
        }
        System.out.println();
    }

}
