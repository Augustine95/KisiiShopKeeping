import java.util.Map;

public class Cashier {
    public static double calculateTotal(Map<Product, Integer> boughtProducts) {
        double total = 0.0;

        for (var shelfProduct : boughtProducts.entrySet())
            total += shelfProduct.getValue() * shelfProduct.getKey().getPrice();

        return total;
    }

    public static void transact(double total, double payment) {
        var balance = payment - total;

        while (balance < 0) {
            Console.promptForMoreCash(balance);
            balance = Console.readNumber() + balance;
        }

        Console.completeTransaction(balance);
    }
}
