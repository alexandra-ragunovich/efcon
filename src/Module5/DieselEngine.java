package Module5;

public class DieselEngine extends Engine{
    private double torque;
    private boolean turbine;
    DieselEngine(double power, double displacement, String manufacture, double torque,boolean turbine){
        super(power,displacement,manufacture);
        this.torque=torque;
        this.turbine=turbine;
    }
    @Override
    protected void getInfo() {
        super.getInfo();
        System.out.println("Крутящий момент: " + torque + " л/100км");
        System.out.println("Наличие турбины: " + turbine);
    }
}

