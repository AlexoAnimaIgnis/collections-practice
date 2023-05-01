package collections.map;

import collections.Product;

public interface ProductLookupTable {

    Product lookupById(final int id);

    void addProduct(Product productToAdd);

    void clear();
}
