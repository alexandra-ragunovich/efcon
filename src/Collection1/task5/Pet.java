package Collection1.task5;

public class Pet {
    private String type;
    public Pet(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Pet{" + "type='" + getType() + "'}";
    }
}
