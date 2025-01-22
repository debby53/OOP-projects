package BANK;

public class FixedDepositAccount extends BankAccount {
    double amount;
    @Override
    public void withdraw(double period) {

       if(period>=6){
           this.balance-=amount;
           System.out.println(" allowed to withdraw  after 6 months and above");
           System.out.println("the remaining balance is "+this.balance);

       }else{
           System.out.println("not allowed to withraw untill 6 months and above");
       }
    }


    public void transferFunds(double amount) {
        System.out.println("yu cannot do transfers on fixed account");

    }
}
