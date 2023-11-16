import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Product {
    private final String name;
    private double price;
    public static int count;

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
        count++;
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

    @Override
    public String toString() {
        var formattedPrice = NumberFormat.getCurrencyInstance(Locale.US).format(price);

        return "name: " + name + " for " +  formattedPrice;
    }
}
