public class OnlinePurchase {
   private String productName;
   private double price ;
   private int  quantity;
   private  String customerName ;
   private   String paymentMethod ;



    public OnlinePurchase(String productName, double price, int quantity, String customerName, String paymentMethod) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.customerName = customerName;
        this.paymentMethod = paymentMethod;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void placeOrder(){
        double totalPrice=price*quantity;
        System.out.println("order confirmed");
        System.out.println("the product name is "+productName);
        System.out.println("the quantity is "+quantity);
        System.out.println("the total price is "+ totalPrice);

    }
    public void makePayment(){
        this.paymentMethod=paymentMethod;
        System.out.println("payment method "+paymentMethod);
        System.out.println("payment successfully");

    }


    public static void main(String[] args) {
        OnlinePurchase p= new OnlinePurchase("chips",5000,2,"debby","credit card");

       p.placeOrder();
        p.makePayment();
    }

}
