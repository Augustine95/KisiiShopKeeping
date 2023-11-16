import java.util.Map;
import java.util.Scanner;

public class Console {
    public static void logAvailableProducts(Shelf shelf) {
        if (Product.count == 0) {
            System.out.println("WARNING: Shelf has no products");
            System.out.println("Add products to shelf");
            return;
        }

        System.out.println();
        System.out.println("Products in the Shelf");
        System.out.println("_____________________________________");
        for (var product : shelf.getProducts())
            System.out.println("id: " + product.getKey() + " " + product.getValue());
        System.out.println("_____________________________________");
        System.out.println();
        System.out.println("**Select an item using its id**");
        System.out.println();
    }

    public static void promptToBuy() {
        System.out.println("_________START SHOPPING________: ");
        System.out.println();
    }

    public static void printErrorIdMessage() {
        System.out.println("Invalid product id. Product not found");
        System.out.println();
    }

    public static void promptForQuantity() {
        System.out.print("Enter quantity: ");
        System.out.println();
    }

    public static void printTotalAmount(double total) {
        System.out.println("The total amount to pay is " + total);
        System.out.print("Enter your cash amount: ");
        System.out.println();
    }

    public static void printCompleteTransaction() {
        System.out.println("Payment Successful!!");
        System.out.println("______THANK YOU FOR SHOPPING WITH US______");
        System.out.println();
    }

    public static void printBalanceAndCompleteTransaction(double balance) {
        System.out.println("Take " + balance + " from the cashier as your balance");
        printCompleteTransaction();
    }

    public static void promptForMoreCash(double balance) {
        System.out.println("Insufficient funds add: " + balance);
    }

    public static double readNumber() {
        return new Scanner(System.in).nextDouble();
    }

    public static void printReceipt(Map<Product, Double> bought) {
        System.out.println("==============================");
        System.out.println("Welcome to Musa buddy shop - Kisii\n");
        System.out.println("Please enter the number of items bought by customer: 3");
        promptBoughtProductDetails();
        System.out.println("*********************************************");
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("Summary of items bought ");
        System.out.println("---------------------------------------------");
        System.out.println("Quantity Description UnitCost SubTotal ");
        System.out.println("---------------------------------------------");
        printBoughProductsDetails();
        System.out.println("---------------------------------------------");
        System.out.println("The total Cost of items is : 2350");
        System.out.println("Please enter the amount tendered by customer : 3000 ");
        System.out.println("The change due to customer is : 650\n");
        System.out.println("Printing Customer receipt!!!!!!!!!! ");
        System.out.println("=============================================");
        System.out.println("=========== Musa buddy shop – Kikuubo========");
        System.out.println("Date: 20 – 03 -2021 Time: 1400 hr");
        System.out.println("------------------------------------------------");
        System.out.println("Total cost of goods 2350 +\n" +
                "Balance to customer 650 -\n" +
                "Amount tendered by customer 3000");
        System.out.println("Thank you ! Come again");
        System.out.println("Goods once sold are not returnable ");
        System.out.println("=============================================");
        System.out.println("==============================");
        System.out.println();
    }

    private static void printBoughProductsDetails() {
        System.out.println("4 Sugar 250 1000 ");
    }

    private static void promptBoughtProductDetails() {
        System.out.println("******************* Item One ************");
        System.out.println("Enter description of Item 1: Sugar ");
        System.out.println("Enter Quantity of Item 1: 4");
        System.out.println("Enter unit cost of item 1 : 250 ");

    }
}
