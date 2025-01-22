package E_COMMERCE_ORDER_SYSTEM;

public abstract class Product implements Shippable{
    private String name;
    private double price;
    private double weightFields;

    public Product(String name, double price, double weightFields) {
        this.name = name;
        this.price = price;
        this.weightFields = weightFields;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeightFields() {
        return weightFields;
    }

    public void setWeightFields(double weightFields) {
        this.weightFields = weightFields;
    }
    public abstract double calculateShippingCost();
    public abstract void getDeliveryTime();
}
