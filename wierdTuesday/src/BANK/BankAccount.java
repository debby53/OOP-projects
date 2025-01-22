package BANK;

import java.util.Scanner;

public class BankAccount {
    int accountNumber;
    double balance;


    public void deposit(double amount){
        if(amount>=1000){
            balance += amount;
            System.out.println("deposit successfully of amount "+amount);
            System.out.println("Total balance: " + balance);

        }else{
            System.out.println("the money must be above 1000");
        }


    }
    public double withdraw(double amount1){
        if(amount1<=balance){
            balance -= amount1;
            System.out.println("withdraw successfully");
            System.out.println("Remaining balance: " + balance);
        }else{
            System.out.println("please reduce your money");
        }
        return amount1;
    }
    public double transferFunds(double amount){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount you want to tranfer");
         amount= sc.nextDouble();
        if(amount>=100 && amount<=balance){
            balance -= amount;
            System.out.println("enter account");
            accountNumber=sc.nextInt();
            System.out.println("transfer successfully  of amount "+amount);
        }else{
            System.out.println("transfer funds not successfully");
        }
        return amount;
    }
}
