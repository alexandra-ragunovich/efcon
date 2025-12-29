package Module5;

public class Car<T extends Engine>  {
    private String brand;
    private T engine;
    private String model;
    private int year;
    Car(String brand,String model, int year,T engine){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.engine=engine;
    }
    public void getInfo(){
        System.out.println("Бренд машины: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Тип двигателя: " + engine.getClass().getSimpleName());
       engine.getInfo();
    }

}
