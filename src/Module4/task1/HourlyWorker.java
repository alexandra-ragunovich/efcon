package Module4.task1;

public class HourlyWorker extends Worker {
    private double hoursWorked;
    private double hourlyRate;
    public HourlyWorker(String name, double hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
