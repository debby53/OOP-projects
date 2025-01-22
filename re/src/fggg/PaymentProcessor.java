package fggg;

public class PaymentProcessor implements Payment {
    private int paymentId;
    private double amount;

    public PaymentProcessor(int paymentId, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be positive.");
        }
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public boolean pay(double amount) throws PaymentException {
        if (amount <= 0) throw new PaymentException("Payment amount must be positive.");
        System.out.println("Processing payment of $" + amount + "...");
        return true;


    }
}
