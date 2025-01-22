import java.util.Scanner;

public class OnlinePurchase {
    private String productName;
    private double price;
    private int quantity;
    private String customerName;
    private String paymentMethod;

    public OnlinePurchase(String productName, String customerName) {
        this.productName = productName;
        this.customerName = customerName;
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
        if(price>=0) {
            this.price = price;

        }else{
            System.out.println("invalid price");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>=0) {
            this.quantity = quantity;

        }else{
            System.out.println("invalid quantity , it should be greater than 0");
        }
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
    public void makePayment(String paymentMethod){
        this.paymentMethod=paymentMethod;
        System.out.println("payment method "+paymentMethod);
        System.out.println("payment successfully");

    }
    public void placeOrder(){
        double totalPrice=quantity*price;
        System.out.println("order placed successfully ");
        System.out.println("the product name is  "+productName);
        System.out.println("the quantity is "+quantity);
        System.out.println("the total price is "+totalPrice);

    }
    public void validation(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter price for "+ productName + ":");
            int enteredPrice=sc.nextInt();
            if(enteredPrice>=0){
                setPrice(enteredPrice);
                break;
            }else{
                System.out.println("invalid price , please try again");
            }
        }
        while(true){
            System.out.println("enter quantity for "+productName + ":");
            int enteredQuantity=sc.nextInt();
            if(enteredQuantity>=0){
                setQuantity(enteredQuantity);
                break;
            }else{
                System.out.println("invalid quantity, please try again");
            }
        }
        sc.nextLine();
        while(true){
            System.out.println("enter payment method which is paypal or credit card");
            String pay=sc.nextLine();
            if(pay.equalsIgnoreCase("paypal")|| pay.equalsIgnoreCase("credit card")){
                setPaymentMethod(pay);
                break;
            }else{
                System.out.println("invalid payment method");
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("order details ");
        System.out.println("enter customer name ");
        String customerName =sc.nextLine();
        System.out.println("enter product name ");
        String productName=sc.nextLine();
        OnlinePurchase purchase1=new OnlinePurchase(productName,customerName);


        purchase1.validation();

        purchase1.placeOrder();
        purchase1.makePayment(purchase1.paymentMethod);

    }
}
