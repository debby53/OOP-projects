package Midterm;

public class Product {
    private String productID;
    private String productName;
    private double price;
    private int quantityInStock;
    private String category;

    public Product(String productID, String productName, double price, int quantityInStock, String category) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.category = category;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
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

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void reduceStock(int quantity){
        if(quantity<=quantityInStock){
            this.quantityInStock-=quantity;
        }
    }
}
