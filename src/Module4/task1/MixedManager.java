package Module4.task1;

public class MixedManager extends Manager {
    private double baseSalary;
    private double salesAmount;
    private double commissionRate;
    public MixedManager(String name, double baseSalary, double salesAmount, double commissionRate) {
        super(name, "Старший менеджер");
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }
    @Override public double calculateSalary() {
        return baseSalary + salesAmount * commissionRate;
    }
}
