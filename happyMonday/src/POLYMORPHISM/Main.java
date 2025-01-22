package POLYMORPHISM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);


            System.out.println("enter the method of your choice (paypal or credit card");
            String method = sc.nextLine();
            if (method.equalsIgnoreCase("paypal")) {
                PayPalPayment p =new PayPalPayment();
                p.pay();
                break;
            }
            else if (method.equalsIgnoreCase("credit card")) {
                CreditCardPayment c=new CreditCardPayment();
                c.pay();
                break;

            } else {
                System.out.println("please choose btn 2");

            }




        }

    }
}
