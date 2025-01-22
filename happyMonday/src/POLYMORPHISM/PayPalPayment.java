package POLYMORPHISM;

public class PayPalPayment implements  Payment{

    @Override
    public void pay() {
        System.out.println("the method is pay pal its being processed");


    }
}
