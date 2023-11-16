import java.util.HashMap;
import java.util.Map;

public class Shelf {
    private int count;
    private final Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(++count, product);
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }
}
