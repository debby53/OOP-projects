package BANKING_APPLICATION;

public class SavingsAccount extends Account implements BankingOperations{
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void deposit(double amount) {
        if(amount>100){
            System.out.println("deposited successfully in your saving account amount "+amount +"the new balance is "+getBalance());
        }

    }

    @Override
    public void withdraw(double amount) {
        System.out.println("no withdraw in saving account");

    }

    @Override
    public void checkBalance() {
        System.out.println("the current balance in saving aacount is "+getBalance());
    }
}
