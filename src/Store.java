import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    private final Shelf shelf = new Shelf();
    private final Product[] products =
    { new Product("Milk", 70), new Product("Soda", 100), new Product("Flour", 150) };
    private final Map<Product, Double> bought = new HashMap<>();
    private int boughtCount;

    private void populateShelfWithProducts() {
        Arrays.stream(products).forEach(shelf::addProduct);
    }

    public void startShopping() {
        promptBuying();

        while (true) {
            int productId = (int)Console.readNumber();
            if (productId == 0) break;
            var product = getProductWithId(productId);
            if (product == null) Console.printErrorIdMessage();
            else {
                Console.promptForQuantity();
                bought.put(product, validateNumber(Console.readNumber()));
            }
        }
    }

    public void processPayment() {
        var total = Cashier.calculateTotal(bought);
        Console.printTotalAmount(total);
        Cashier.transact(total, Console.readNumber());
        Console.printReceipt(bought);
    }

    private Product getProductWithId(int id) {
        for (var item : shelf.getProducts())
            if (item.getKey() == id) return item.getValue();

        return null;
    }

    private void promptBuying() {
        populateShelfWithProducts();
        Console.logAvailableProducts(shelf);
        Console.promptToBuy();
    }

    private double validateNumber(double quantity) {
        if (quantity <= 0)
            throw new IllegalArgumentException("Invalid quantity.");
        return quantity;
    }
}
