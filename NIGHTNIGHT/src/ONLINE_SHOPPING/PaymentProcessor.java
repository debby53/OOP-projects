package ONLINE_SHOPPING;

public class PaymentProcessor implements Payment{
    private int paymentId;
    private double amount;

    public PaymentProcessor(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay(double amount) throws InvalidPaymentException {
if(amount<=0)throw new InvalidPaymentException("payment cannot be below 0");
        System.out.println("payment of "+amount + "proccessed successfuly");


    }
}
