package BANKING_OPRATIONS;

public class SavingAccount extends Account implements BankingOperations{
    public SavingAccount(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public void withdraw(double amount) {

        if(amount<getBalance()){
           setBalance(getBalance()-amount);
            System.out.println("you have withdrawn "+ amount + "the remaining balance is "+getBalance());
        } else if (amount<=0) {
            System.out.println("we dont allow negative money");
        }else {

            System.out.println("insufficient funds");
        }

    }

    @Override
    public void deposit(double amount) {
        if(amount>1000){
            setBalance(getBalance()+amount);
            System.out.println("deposit successfully, yu have deposited "+amount +"and the remaining is "+getBalance());
        }else{
            System.out.println("deposit cannot be allowed");
        }

    }

    @Override
    public void checkBalance() {
        System.out.println("the current balance is "+getBalance());

    }
}
