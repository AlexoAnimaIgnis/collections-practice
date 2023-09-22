package collections.map;

import collections.Product;

import java.util.HashMap;
import java.util.Map;

public class MapProductLookupTable implements ProductLookupTable {
    private Map<Integer, Product> idToProduct = new HashMap<>();


    @Override
    public Product lookupById(int id) {
        return idToProduct.get(id);
    }

    @Override
    public void addProduct(Product productToAdd) {
        int id = productToAdd.getId();
        if(idToProduct.containsKey(id)) {
            throw new IllegalArgumentException(
                    "unable to add product duplicate id for " + productToAdd
            );
        }
        idToProduct.put(id, productToAdd);

    }

    @Override
    public void clear() {
        idToProduct.clear();
    }

    private void mapApis() {
        Map.Entry<String, Integer> entry = Map.entry("alexo", 27);
        Map<String, Integer> personToAge = Map.of("Alexo", 27);
        personToAge = Map.ofEntries(Map.entry("Alexo", 28));
        Map<String, Integer> copy = Map.copyOf(personToAge);
    }
}
