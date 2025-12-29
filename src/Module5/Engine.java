package Module5;

public abstract class Engine {
    protected double power;
    protected double displacement;
    protected String manufacture;
    Engine(double power, double displacement, String manufacture){
        this.power=power;
        this.displacement=displacement;
        this.manufacture=manufacture;
    }
    protected void getInfo(){
        System.out.println("\nИнформация о двигателе\n");
        System.out.println("Производитель: " + manufacture);
        System.out.println("Мощность: " + power + " л.с.");
        System.out.println("Объем: " + displacement + " л.");
    }
}
