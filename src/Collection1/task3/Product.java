package Collection1.task3;

public class Product {
    private double size;
    private double price;

    Product(double size, double price) {
        this.size = size;
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
    @Override public String toString() {
        return "size=" + getSize() + ", price=" + getPrice();
    }
}
