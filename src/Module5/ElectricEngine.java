package Module5;

public class ElectricEngine extends Engine{
    private double batteryCapacity;
    private double chargingTime;
    ElectricEngine(double power, double displacement, String manufacture, double batteryCapacity,double chargingTime){
        super(power,displacement,manufacture);
        this.batteryCapacity=batteryCapacity;
        this.chargingTime=chargingTime;
    }
    @Override
    protected void getInfo() {
        super.getInfo();
        System.out.println("Емкость батареи: " + batteryCapacity + " л/100км");
        System.out.println("Время зарядки: " + chargingTime);
    }
}
