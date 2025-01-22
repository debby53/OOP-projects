package BANK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount bankAccount=new BankAccount();
        CheckingAccount checkingAccount=new CheckingAccount();
        FixedDepositAccount fixedDepositAccount=new FixedDepositAccount();
        SavingsAccount savingsAccount=new SavingsAccount();

        System.out.println("enter your initial balance");
        bankAccount.balance=sc.nextDouble();

        while(true){
            System.out.println("enter amount to deposit");
            double amount=sc.nextDouble();
            if(amount>=1000){
                bankAccount.deposit(amount);
                break;
            }else{
                System.out.println("please try again");
            }
        }
        while(true){
            System.out.println("enter amount you want to withdraw");
            double amount=sc.nextDouble();
            if(amount>=0 && amount<= bankAccount.balance){
                bankAccount.withdraw(amount);
                break;
            }else{
                System.out.println("please try again");
            }
        }
        while(true){
            System.out.println("enter the amount you want to transfer");
            double amount=sc.nextDouble();
            if(amount>=0 && amount<= bankAccount.balance){
                bankAccount.transferFunds(amount);
                break;
            }else{
                System.out.println("try again");
            }
        }
        System.out.println("enter your balance for saving account");
        checkingAccount. balance=sc.nextDouble();
        while(true){
            System.out.println("enter amount you want to withdraw");
            double amount=sc.nextDouble();
            if( amount> checkingAccount.balance){
                checkingAccount.withdraw(amount);
                break;
            }else{
                System.out.println("please try again");
            }
        }


        while(true){
            System.out.println("enterperiod you want to withdraw");
            double period=sc.nextDouble();
            if( period>=12){
                fixedDepositAccount.withdraw(period);
                break;
            }else{
                System.out.println("please try again");
            }
        }
        while(true){
            System.out.println("enter amount you want to withdraw");
            double amount=sc.nextDouble();
            if( amount<= 10000){
                savingsAccount.withdraw(amount);
                break;
            }else{
                System.out.println("please try again");
            }
        }






    }
}
