package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionConcepts {

    public static void main(String[] args) {
        Product door = new Product(1, "door", 35);
        Product floor = new Product(2, "floor", 25);
        Product window = new Product(3, "window", 10);

        Collection<Product> productCollection = new ArrayList<>();
        productCollection.add(door);
        productCollection.add(floor);
        productCollection.add(window);
    }
}
