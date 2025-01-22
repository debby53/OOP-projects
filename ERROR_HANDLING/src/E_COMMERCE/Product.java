package E_COMMERCE;

public abstract class Product implements Discountable {
    private String productName;
    private double price;
    private String category;

    public Product(String productName, String category, double price) {
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public abstract void  applyDiscount();
    public  abstract void calculateFinalPrice();

}
