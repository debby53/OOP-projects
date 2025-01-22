package E_comerce;

public class Product {
  private   int productId;
   private String name;
   private double price;

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
        if(price>0) {
            this.price = price;
        }else {
            System.out.println("the price must be above 0");
        }

    }

    public double getDiscountedPrice(){
        return 0.0;

   }
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("dicount is "+getDiscountedPrice());



    }

}
