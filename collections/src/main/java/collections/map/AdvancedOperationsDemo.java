package collections.map;

import collections.Product;
import collections.ProductFixtures;

import java.util.HashMap;

public class AdvancedOperationsDemo {
    public static void main(String[] args) {
        var defaultProduct = new Product(-1, "Whatever the customer wants", 100);

        var idToProduct = new HashMap<Integer, Product>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(1, ProductFixtures.floor);
        idToProduct.put(1, ProductFixtures.window);

        // will return a null value, if we try to get an id that is not existing
        System.out.println(idToProduct.get(10));

        // return a default value if id is not existing inside the map.
        System.out.println(idToProduct.getOrDefault(10, defaultProduct));
    }
}
