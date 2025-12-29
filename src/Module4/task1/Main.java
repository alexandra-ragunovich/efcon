package Module4.task1;

public class Main {
    public static void main(String[] args){
        Employee e1 = new HourlyWorker("Иван", 160, 12);
        Employee e2 = new SalesManager("Мария", 50000, 0.05);
        Employee e3 = new MixedManager("Алексей", 20000, 40000, 0.03);
        System.out.println(e1.getName() + " (" + e1.getPosition() + ") зарплата: " + e1.calculateSalary());
        System.out.println(e2.getName() + " (" + e2.getPosition() + ") зарплата: " + e2.calculateSalary());
        System.out.println(e3.getName() + " (" + e3.getPosition() + ") зарплата: " + e3.calculateSalary());
    }
}
