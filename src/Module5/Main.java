package Module5;

public class Main {
    public static void main(String[] args) {
        GasolineEngine gasolineEngine = new GasolineEngine( 150, 2.0, "Toyota", 6.5, 95);
        DieselEngine dieselEngine = new DieselEngine( 180, 2.2, "Volkswagen", 7.0, true);
        ElectricEngine electricEngine = new ElectricEngine( 200, 0, "Tesla", 75, 8);
        Car<GasolineEngine> car1 = new Car<>("Toyota", "Corolla", 2020, gasolineEngine);
        Car<DieselEngine> car2 = new Car<>("Volkswagen", "Passat", 2019, dieselEngine);
        Car<ElectricEngine> car3 = new Car<>("Tesla", "Model 3", 2021, electricEngine);
        System.out.println("=== Информация о машинах ===");
        car1.getInfo();
        System.out.println("----------------------------");
        car2.getInfo();
        System.out.println("----------------------------");
        car3.getInfo(); }
}
