package Module11.task3;

public class Department {
    @departmentInfo(year = 2026)
    public void displayDepartment() {
        System.out.println("This is the department info method.");
    }

    public void regularMethod() {
        System.out.println("This is a simple method without annotation.");
    }
}
