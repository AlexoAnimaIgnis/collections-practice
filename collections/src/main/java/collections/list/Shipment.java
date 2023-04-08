package collections.list;

import collections.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private final List<Product> productList = new ArrayList<>();

    public void add(Product product) {
        productList.add(product);
    }

    public void replace(Product oldProduct, Product newProduct) {

    }

    @Override
    public Iterator<Product> iterator() {
        return productList.iterator();
    }
}
