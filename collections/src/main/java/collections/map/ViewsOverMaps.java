package collections.map;

import collections.Product;
import collections.ProductFixtures;

import java.util.HashMap;

public class ViewsOverMaps {

    public static void main(String[] args) {

        var idToProduct = new HashMap<Integer, Product>();

        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.window);
        idToProduct.put(3, ProductFixtures.floor);

        var ids = idToProduct.keySet(); // returns unique set of KEYS
        var values = idToProduct.values(); // returns collection of VALUES
        var entries = idToProduct.entrySet(); // returns unique set of KEYS

        System.out.println(ids);
        System.out.println(idToProduct);
        System.out.println(values);

    }
}
