package BANK;

import java.util.Scanner;

public class FixedDepositAccount extends BankAccount {




    @Override
    public double withdraw(double period) {
        if(period>=12){
            System.out.println("you can withdraw");
        }else {
            System.out.println("period must be one year and above");

        }
        return period;

    }

    @Override
    public double transferFunds(double period) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter money for transfer");
        double money=sc.nextDouble();
        System.out.println("transer after 12 months successfully");
        return period;

    }
}
