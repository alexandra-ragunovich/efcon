package Module4.task1;

public abstract class Employee implements Payable{
    protected String name;
    protected String position;
public Employee(String name, String position){
    this.name=name;
    this.position=position;
}
    public String getName() {
    return name;
}
public String getPosition() {
    return position;
}
}
