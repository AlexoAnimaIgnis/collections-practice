package collections.map;

import collections.Product;

import java.util.ArrayList;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable {

    private final List<Product> productList = new ArrayList<>();

    @Override
    public Product lookupById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product productToAdd) {
        int id = productToAdd.getId();
        for (Product product : productList) {
            if (product.getId() == id) {
                throw new IllegalArgumentException(
                        "unable to add new product. duplicate id +" + id
                );
            }
        }

    }

    @Override
    public void clear() {
        productList.clear();
    }
}
