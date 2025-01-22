package BANKING_APPLICATION;

public class FixedDeposit extends Account implements BankingOperations {
    public FixedDeposit(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void deposit(double amount) {
        if(amount>100){
            setBalance(getBalance()+amount);
            System.out.println("deposited successfully in fixed deposit account amount "+amount + "the new balance is "+getBalance());
        }else{
            System.out.println("deposit failed in fixed depsit");
        }

    }

    @Override
    public void withdraw(double amount) {
        System.out.println("please wait for 2 years to withdrwa in this fixed deposit account");

    }

    @Override
    public void checkBalance() {
        System.out.println("the current balance is "+getBalance());
    }


}
