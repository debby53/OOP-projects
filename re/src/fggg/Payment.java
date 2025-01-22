package fggg;

public interface Payment {
    boolean pay(double amount) throws PaymentException;
}
