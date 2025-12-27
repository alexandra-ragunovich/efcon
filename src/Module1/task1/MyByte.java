package Module1.task1;

public class MyByte {
    private byte value;
    public static final byte MIN = Byte.MIN_VALUE;
    public static final byte MAX = Byte.MAX_VALUE;

    public MyByte(byte value) {
        this.value = value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public byte getValue() {
        return value;
    }

}


