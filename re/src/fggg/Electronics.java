package fggg;

public class Electronics  extends Product{
    private int warrantyPeriod;

    public Electronics(int productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String getDetails() {
        return "Electronics [ID: " + productId + ", Name: " + name + ", Price: " + price + ", Warranty: " + warrantyPeriod + " months]";
    }
}
