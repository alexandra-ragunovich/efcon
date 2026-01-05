package Collection1.task4;

public class Student {
    private String firstName;
    private int group;
    private int course;
    private int[] grades;

    Student(String firstName, int group, int course, int[] grades) {
        this.firstName = firstName;
        this.group = group;
        this.course = course;
        this.grades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            this.grades[i] = grades[i];
        }
    }
    public String getFirstName() {
        return firstName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

}
