package POLYMORPHISM;

public class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("you chose credit card is being processed");


    }
}
