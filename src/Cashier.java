import java.util.Map;

public class Cashier {
    public static double calculateTotal(Map<Product, Double> boughtProducts) {
        double total = 0.0;

        for (var shelfProduct : boughtProducts.entrySet())
            total += shelfProduct.getValue() * shelfProduct.getKey().getPrice();

        return total;
    }

    public static void transact(double total, double payment) {
        var balance = payment - total;

        while (true) {
            if (balance >= 0) {
                Console.printBalanceAndCompleteTransaction(balance);
                break;
            }
            else {
                Console.promptForMoreCash(balance);
                transact(balance, Console.readNumber());
            }
        }
    }
}
