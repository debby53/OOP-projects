package E_COMMERCE;

public class Groceries extends  Product implements Returnable{
    public Groceries(String productName, String category, double price) {
        super(productName, category, price);
    }

    @Override
    public void applyDiscount() {

    }

    @Override
    public void calculateFinalPrice() {

    }
}
