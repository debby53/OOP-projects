package Midterm;

public class Order {
    private String productID;
    private int quantity;
    private Product product;

    public Order(String productID, int quantity, Product product) {
        this.productID = productID;
        this.quantity = quantity;
        this.product = product;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public boolean isStockAvailable(){
        return product.getQuantityInStock()>=quantity;
    }
    public void processesOrder(){
        if(isStockAvailable()){
            double totalPrice=product.getPrice()*quantity;
            System.out.println("oder  placed successfully");
        }else{
            System.out.println("insufficient quantity");
        }
    }
    public void makePayment(double totalPrice){
        System.out.println("Processing payment of $" + totalPrice + "...");
        System.out.println("payment made successfully");
        product.reduceStock(quantity);
        System.out.println("Stock updated: " + product.getQuantityInStock() + " units remaining.");
    }

    public static void main(String[] args) {
        Product laptop=new Product("p001","Lenovo",23456777,10,"electronics");
        Product tshirt = new Product("P002", "T-Shirt", 19.99, 50, "Clothes");
        Order newlaptop=new Order("p001",2,laptop);
        newlaptop.processesOrder();
        Order tshirtOrder = new Order("P002", 30, tshirt); // Exceeds stock
        tshirtOrder.processesOrder();
        newlaptop.makePayment(5000);
        tshirtOrder.makePayment(10000);
    }
}
