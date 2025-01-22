package BANK;

import java.util.Scanner;

public class CheckingAccount extends BankAccount {

    double overdraftLimit;



    @Override
    public double withdraw(double amount1) {
        if(amount1>super.balance+overdraftLimit){
           super.balance -=amount1;
            System.out.println("withdraw on overdraft" + "remaining balance "+super.balance);
            System.out.println("remaining balance "+ super.balance);
        }else{
            System.out.println("Overdraft limit exceeded in CheckingAccount.");
        }
        return amount1;
    }

    @Override
    public double transferFunds(double amount) {
        System.out.println("transfer funds on overdraft succfully" +amount);
        return amount;
    }
}
