public class Main {
    public static void main(String[] args) {
        var shelf = new Store().getShelfWithProducts();

        Console.logProducts(shelf);
    }
}