package collections.streams;

import collections.Product;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionFactories {
    public static Product door = new Product(1, "Wooden Door", 35);
    public static Product floorPanel = new Product(2,"Floor Panel", 25);
    public static Product window = new Product(3,"Glass Window", 10);

    public static void main(String[] args)
    {
        var products = new ArrayList<Product>();
        Collections.addAll(products, door, floorPanel, window);


        System.out.println("products = " + products);

        Collections.fill(products, null);

        System.out.println("products = " + products);

    }
}
