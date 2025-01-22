package BANKING_OPRATIONS;

public class FixedDeposit extends Account implements BankingOperations{
    public FixedDeposit(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("no withdrwa in fixed account account");
    }

    @Override
    public void deposit(double amount) {
        if(amount>0){
            setBalance(getBalance()-amount);
            System.out.println("deposit successfully of the "+amount +"balance is "+getBalance());
        }else {
            System.out.println("no deposit");
        }

    }

    @Override
    public void checkBalance() {
        System.out.println("the current balance is "+getBalance());
    }
}
