import java.util.Arrays;

public class Store {
    private final Shelf shelf = new Shelf();
    private final Product[] products =
    { new Product("Milk", 70), new Product("Soda", 100), new Product("Flour", 150) };

    public Shelf getShelfWithProducts() {
        Arrays.stream(products).forEach(shelf::addProduct);

        return shelf;
    }
}
