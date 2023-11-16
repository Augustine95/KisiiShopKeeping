public class Product {
    private final String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0)
            throw new IllegalArgumentException("Price cannot be 0 or less");
        this.price = price;
    }

    public String getName() {
        return name;
    }

}
