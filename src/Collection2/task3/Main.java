package Collection2.task3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> catalog = Arrays.asList(
                new Product("Телефон", 1200.0, 4.5),
                new Product("Ноутбук", 2500.0, 4.8),
                new Product("Наушники", 150.0, 4.2),
                new Product("Планшет", 800.0, 4.0),
                new Product("Камера", 2000.0, 4.7)
        );

        System.out.println("\nСортировка по цене (от большего к меньшему):");
        printSorted(catalog, true);

        System.out.println("\nСортировка по цене (от меньшего к большему):");
        printSorted(catalog, false);
    }

    public static void printSorted(List<Product> products, boolean reverse) {
        Comparator<Product> comparator = Comparator.comparingDouble(Product::getPrice);
        if (reverse) comparator = comparator.reversed();

        products.sort(comparator);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
