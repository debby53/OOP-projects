package BANK;

import java.util.Scanner;

public class SavingsAccount extends BankAccount {
    double interestRate;





    @Override
    public double withdraw(double amount1) {
        if(amount1<=10000 && amount1<=super.balance){
            super.withdraw(amount1);

        }else{
            System.out.println("u should no go above 10k");
        }
        return amount1;

    }

    @Override
    public double transferFunds(double amount) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter money for transfer");
        double money=sc.nextDouble();
        System.out.println("transfer successfully "+amount);
       return amount;
    }

}
