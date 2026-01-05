package Collection1.task3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Product> toys = new HashMap<>();
        toys.put("Мяч", new Product(15, 15.5));
        toys.put("Кукла", new Product(40, 45.0));
        toys.put("Машинка", new Product(100, 25.0));

        printEntries(toys);
        printKeys(toys);
        printValues(toys);
    }

    public static void printEntries(Map<String, Product> map) {
        System.out.println("entrySet");
        for (Map.Entry<String, Product> entry : map.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Объект: " + entry.getValue());
        }
    }

    public static void printKeys(Map<String, Product> map) {
        System.out.println(" keySet");
        for (String key : map.keySet()) {
            System.out.println("Имя продукта: " + key);
        }
        System.out.println();
    }

    public static void printValues(Map<String, Product> map) {
        System.out.println("values");
        for (Product product : map.values()) {
            System.out.printf("Размер: %.0f, Цена: %.2f%n", product.getSize(), product.getPrice());
        }
        System.out.println();
    }
}
