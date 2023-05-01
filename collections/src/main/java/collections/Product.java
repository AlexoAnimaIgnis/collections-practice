package collections;

import java.util.Comparator;

public class Product {
    private final int id;
    private final String name;
    private final int weight;

    public Product(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product: { " +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static final Comparator<Product> BY_WEIGHT =
            Comparator.comparingInt(Product::getWeight);
}
