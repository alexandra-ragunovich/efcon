package Module1.task1;

public class MyLong { private long value;
    public static final long MIN = Long.MIN_VALUE;
    public static final long MAX = Long.MAX_VALUE;
    public MyLong(long value) {
        this.value = value;
    }
    public void increment() {
        value++;
    }
    public void decrement() {
        value--;
    }
    public long getValue() {
        return value;
    }
}
