package Collection2.task1;

public class Student {
    private String name;
    private int group;
    private int course;
    private int[] grades;
    public Student(String name, int group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    public String getName() {
        return name;
    }
    public int getGroup() {
        return group;
    }
    public int getCourse() {
        return course;
    }
    public int[] getGrades() {
        return grades;
    }
    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
    @Override
    public String toString() {
        return "name='" + getName() + "', group=" + getGroup() + ", course=" + getCourse() + ", avg=" + String.format("%.2f", getAverageGrade()); }
}
