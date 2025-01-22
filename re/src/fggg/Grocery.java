package fggg;

import java.time.LocalDate;

public class Grocery extends Product{
    private LocalDate expiryDate;

    public Grocery(int productId, String name, double price, LocalDate expiryDate) {
        super(productId, name, price);
        if (expiryDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Expiry date must be in the future.");
        }
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDetails() {
        return "Grocery [ID: " + productId + ", Name: " + name + ", Price: " + price + ", Expiry: " + expiryDate + "]";
    }
}
