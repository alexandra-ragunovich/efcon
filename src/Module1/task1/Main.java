package Module1.task1;

public class Main { public static void main(String[] args) {
    MyByte minByte = new MyByte(MyByte.MIN);
    MyByte maxByte = new MyByte(MyByte.MAX);
    MyShort minShort = new MyShort(MyShort.MIN);
    MyShort maxShort = new MyShort(MyShort.MAX);
    MyInt minInt = new MyInt(MyInt.MIN);
    MyInt maxInt = new MyInt(MyInt.MAX);
    MyLong minLong = new MyLong(MyLong.MIN);
    MyLong maxLong = new MyLong(MyLong.MAX);
    System.out.println("Начальные значения:");
    System.out.println("Byte: min=" + minByte.getValue() + ", max=" + maxByte.getValue());
    System.out.println("Short: min=" + minShort.getValue() + ", max=" + maxShort.getValue());
    System.out.println("Int: min=" + minInt.getValue() + ", max=" + maxInt.getValue());
    System.out.println("Long: min=" + minLong.getValue() + ", max=" + maxLong.getValue());
    maxByte.increment();
    minByte.decrement();
    maxShort.increment();
    minShort.decrement();
    maxInt.increment();
    minInt.decrement();
    maxLong.increment();
    minLong.decrement();
    System.out.println("\nПосле изменений:");
    System.out.println("Byte: min=" + minByte.getValue() + ", max=" + maxByte.getValue());
    System.out.println("Short: min=" + minShort.getValue() + ", max=" + maxShort.getValue());
    System.out.println("Int: min=" + minInt.getValue() + ", max=" + maxInt.getValue());
    System.out.println("Long: min=" + minLong.getValue() + ", max=" + maxLong.getValue()); }
}

