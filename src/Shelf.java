import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shelf {
    private int count;
    private final Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(++count, product);
    }

    public Set<Map.Entry<Integer, Product>> getProducts() {
        return products.entrySet();
    }
}
