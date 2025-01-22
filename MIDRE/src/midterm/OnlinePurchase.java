package midterm;

import java.util.Scanner;

public class OnlinePurchase {
   private String productName ;
  private double  price ;
    private int quantity;
  private String  customerName;
  private String paymentMethod;

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
        if(price>0) {
            this.price = price;
        }else{
            System.out.println("the price is alz greater than 0 nothing for free");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0) {
            this.quantity = quantity;
        }else{
            System.out.println("quaatity must be at least one");
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
        if(paymentMethod.equalsIgnoreCase("PayPall") ||paymentMethod.equalsIgnoreCase("credit card") ) {
            this.paymentMethod = paymentMethod;
        }else{
            System.out.println("invalid method of payment please choose between credit card or paypal");
        }
    }
    public void placeOrder(){
        if(quantity>0 && price>0) {
            double totalPrice = quantity * price;
            System.out.println("order confirmed");
            System.out.println("the product name is " + productName);
            System.out.println("the quantity is " + quantity);
            System.out.println("the total price is " + totalPrice);
        }else{
            System.out.println("please enter valid inputs");
        }
    }
    public void payment(){
        if(paymentMethod!=null  &&    ( paymentMethod.equalsIgnoreCase("paypal")|| paymentMethod.equalsIgnoreCase("credit card"))) {
            System.out.println("the payment method is " + paymentMethod);
            System.out.println("payment made successfully");
        }else{
            System.out.println("payment not successfully made");
        }

    }
    public static double getValidInputs(Scanner sc,String inputs){
        double amount =-1;
        while(amount<0){
            System.out.println("enter "+inputs + "that is above 0");
            amount=sc.nextDouble();
            if(amount<0){
                System.out.println("please enter correct amount");
            }
        }
        return amount;
    }


    public static String checkPaymentMethodValidity(Scanner sc,String method){
        String pMethod="";
        while(!(pMethod.equalsIgnoreCase("credit card")|| pMethod.equalsIgnoreCase("PayPall"))) {
            System.out.println("enter " + method + "of payment");
            pMethod = sc.nextLine();
            if (!(pMethod.equalsIgnoreCase("credit card")|| pMethod.equalsIgnoreCase("paypall"))) {
                System.out.println("insert good payment method");
            }
        }
        return pMethod;

    }





    public static void main(String[] args) {
        OnlinePurchase purchase=new OnlinePurchase();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter customer name: ");
        purchase.customerName=sc.nextLine();
        System.out.println("enter product name");
        purchase.setProductName(sc.nextLine());
        double  p=getValidInputs(sc,"price ");
        purchase.setPrice(p);
        int q= (int) getValidInputs(sc,"quantity");
        purchase.setQuantity(q);
        sc.nextLine();
        String  py=checkPaymentMethodValidity(sc,"method");
        purchase.setPaymentMethod(py);
        purchase.placeOrder();
        purchase.payment();


    }
}
