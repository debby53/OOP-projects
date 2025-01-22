package ONLINE_SHOPPING;

public interface Payment {
    void pay(double amount) throws InvalidPaymentException;
}
