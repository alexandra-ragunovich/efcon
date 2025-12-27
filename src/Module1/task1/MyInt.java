package Module1.task1;

public class MyInt { private int value;
    public static final int MIN = Integer.MIN_VALUE;
    public static final int MAX = Integer.MAX_VALUE;
    public MyInt(int value) {
        this.value = value;
    }
    public void increment() {
        value++;
    }
    public void decrement() {
        value--;
    }
    public int getValue() {
        return value; }
}
