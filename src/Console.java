public class Console {
    public void logProducts(Shelf shelf) {
        for (var item : shelf.getProducts()) {
            System.out.println();
            System.out.println("_____________");
            System.out.println("Products in the Shelve");
            System.out.println("id: " + item.getKey() + " name: " + item.getValue());
            System.out.println();
            System.out.println("Select an item using its id");
            System.out.println("_____________");
            System.out.println();
        }
    }
}
