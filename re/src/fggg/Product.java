package fggg;

import java.util.HashSet;
import java.util.Set;

public  abstract class Product {
    private static Set<Integer>productIds=new HashSet<>();
    protected int productId;
    protected String name;
    protected double price;

    public static Set<Integer> getProductIds() {
        return productIds;
    }

    public static void setProductIds(Set<Integer> productIds) {
        Product.productIds = productIds;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public Product(int productId, String name, double price) {
        if(productId<=0 || productIds.contains(productId)){
            throw new IllegalArgumentException("Product muts be positive");
        }
        if(name==null || name.isEmpty() ){
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive.");
        }
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public abstract String getDetails();
}
