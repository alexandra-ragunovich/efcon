package Module5;

public class GasolineEngine extends Engine{
    private double consumption;
    private double octaneRating;
    GasolineEngine(double power, double displacement, String manufacture, double consumption,double octaneRating){
        super(power,displacement,manufacture);
        this.consumption=consumption;
        this.octaneRating=octaneRating;
    }
    @Override protected void getInfo() {
        super.getInfo();
        System.out.println("Расход топлива: " + consumption + " л/100км");
        System.out.println("Октановое число: " + octaneRating);
    }
}
