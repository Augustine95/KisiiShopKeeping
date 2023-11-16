public class Console {
    public static void logProducts(Shelf shelf) {
        if (Product.count == 0) {
            System.out.println("WARNING: Shelf has no products");
            System.out.println("Add products to shelf");
            return;
        }

        System.out.println();
        System.out.println("Products in the Shelf");
        System.out.println("_____________________________________");
        for (var item : shelf.getProducts()) {
            System.out.println("id: " + item.getKey() + " " + item.getValue());
        }
        System.out.println("_____________________________________");
        System.out.println();
        System.out.println("**Select an item using its id**");
        System.out.println();
    }
}
