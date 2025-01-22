package BANK;

public class SavaingAccount extends BankAccount {
    double interestRate;

    @Override
    public void withdraw(double amount) {
        if(amount<=10000 && interestRate>=0.10){
            super.balance=-amount;
            System.out.println("well withdrawn is saving account" +super.balance);
        }else{
            System.out.println("not allowed in saving account to go above 10k");
        }

    }


    public void transferFunds() {
        System.out.println("transfering funds in saving not allowed");
    }

}
