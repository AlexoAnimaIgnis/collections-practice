package collections.list;

import collections.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private static final int MISSING_PRODUCT = -1;
    private final List<Product> productList = new ArrayList<>();

    private List<Product> lightVanProducts;
    private List<Product> heavyVanProducts;

    public void add(Product product) {
        productList.add(product);
    }

    public boolean replace(Product oldProduct, Product newProduct) {
        if(productList.indexOf(oldProduct) > MISSING_PRODUCT) {
            productList.set(productList.indexOf(oldProduct), newProduct);
            return true;
        }
        return false;
    }

    public void prepare() {
        productList.sort(Product.BY_WEIGHT);
        int splitPoint = findSplitPoint();
        lightVanProducts = productList.subList(0, splitPoint);
        heavyVanProducts = productList.subList(splitPoint, productList.size());
    }

    private int findSplitPoint() {
        int size = productList.size();
        for(int i = 0; i < size; i++) {
            Product product = productList.get(i);
            if(product.getWeight() > LIGHT_VAN_MAX_WEIGHT) {
                return i;
            }
        }

        return 0;
    }

    public List<Product> getHeavyVanProducts() {
        return heavyVanProducts;
    }

    public List<Product> getLightVanProducts() {
        return lightVanProducts;
    }

    @Override
    public Iterator<Product> iterator() {
        return productList.iterator();
    }
}
