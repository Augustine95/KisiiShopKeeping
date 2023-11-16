import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class Console {
    public static void logAvailableProducts(Shelf shelf) {
        if (Product.count == 0) {
            System.out.println("WARNING: Shelf has no products");
            System.out.println("Add products to shelf");
            return;
        }

        System.out.println("=============================================");
        System.out.println("*********Welcome to Campus Mart eShop********");
        System.out.println("=============================================");
        for (var product : shelf.getProducts())
            System.out.println("(" + product.getKey() + ") " + product.getValue());
        System.out.println("_____________________________________________");
        System.out.println();
        System.out.println("********SELECT PRODUCTS BY THEIR IDs********");
        System.out.println();
    }

    public static void promptToBuy() {
        System.out.print("Enter product id: ");
    }

    public static void printInvalidIdMessage() {
        System.out.println("Invalid product id. Product not found");
        System.out.println();
    }

    public static void promptForQuantity(Product product) {
        System.out.print("Enter quantity for " + product + ": ");
    }

    public static void printTotalAmount(double total) {
        System.out.println("The total amount to pay is " + total);
        System.out.print("Enter your cash amount: ");
    }

    public static void printCompleteTransaction() {
        System.out.println();
        System.out.println("------------Payment Successful!!----------");
        System.out.println("______THANK YOU FOR SHOPPING WITH US______");
        System.out.println();
    }

    public static void completeTransaction(double balance) {
        if (balance > 0)
            System.out.println("Take " + balance + " from the cashier as your balance");
        printCompleteTransaction();
    }

    public static void promptForMoreCash(double balance) {
        System.out.println("---------------------------------------------");
        System.out.println("PENDING PAYMENT of $" + Math.abs(balance));
        System.out.println("---------------------------------------------");
        System.out.print("Add some more cash for: ");
    }

    public static double readNumber() {
        return new Scanner(System.in).nextDouble();
    }

    public static void printReceipt(Map<Product, Integer> bought) {
        System.out.println("============================================");
        System.out.println("Quantity Description UnitCost SubTotal ");
        System.out.println("---------------------------------------------");
        System.out.println("Printing Customer receipt... ");
        System.out.println("=============================================");
        System.out.println("=========== Campus Mart eShop ===============");
        printBoughProductsDetails(bought);
        System.out.println();
        System.out.println(new Date());
        System.out.println("--------------------------------------------");
        System.out.println("Thank you ! Come again");
        System.out.println("Goods once sold are not returnable ");
        System.out.println("============================================");
        System.out.println();
    }

    private static void printBoughProductsDetails(Map<Product, Integer> bought) {
        for (var item : bought.entrySet()) {
            var product = item.getKey();
            var quantity = item.getValue();
            var total = product.getPrice() * quantity;

            System.out.println(quantity + " " + product.getName() + " @ " + product.getPrice() + " for " + total);
        }
    }

    public static void showHowToStopShopping() {
        System.out.println("_________START SHOPPING________: ");
        System.out.println("ENTER 0 WHEN YOU'RE DONE SHOPPING");
        System.out.println();
    }
}
