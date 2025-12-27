package Module1.task1;

public class MyShort {
    private short value;
    public static final short MIN = Short.MIN_VALUE;
    public static final short MAX = Short.MAX_VALUE;
    public MyShort(short value) {
        this.value = value;
    }
    public void increment() {
        value++;
    }
    public void decrement() {
        value--;
    }
    public short getValue() {
        return value;
    }
}