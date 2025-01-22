package BANK;

public class BankAccount {
    int  accountNumber;
    double balance;

    public void deposit(double amount){
        if(amount>100){
          this. balance+=amount;
            System.out.println("well deposited" + amount);
            System.out.println("the remaining balance is "+this.balance);
        }else{
            System.out.println("deposit should be above 100");
        }

    }
    public  void  withdraw(double amount){
        if(amount<balance){
    this.balance-=amount;
    System.out.println("well withdraw "+amount);
    System.out.println("the remaining balance is "+this.balance);

}
    }
    public void transferFunds(double amount){
        if(accountNumber==1234567 && amount<this.balance){
           this. balance-=amount;
            System.out.println("well transfred this amount "+ amount);
            System.out.println("the remaining balance is "+this.balance);
        }else{
            System.out.println("dont scam");
        }

    }
}
