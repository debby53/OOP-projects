package BANK;

public class CheckingAccount extends BankAccount {
    double overdraftLimit;

    @Override
    public void withdraw(double amount) {
        if(amount<=this.balance){
            balance-=amount;
            System.out.println("well succeffully withdrawn this amount "+amount);
            System.out.println("the remaining balance is "+this.balance);

        } else {
            if (amount >= this.balance) {
                System.out.println("you got overdraft of " + amount);
                System.out.println("the remaining balance is " + this.balance);

            }
        }
    }

}
