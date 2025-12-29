package Module4.task1;

public class SalesManager extends Manager {
    private double salesAmount;
    private double commissionRate;
    public SalesManager(String name, double salesAmount, double commissionRate) {
        super(name, "Менеджер по продажам");
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }
    @Override public double calculateSalary() {
        return salesAmount * commissionRate;
    }
}
