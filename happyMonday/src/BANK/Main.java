package BANK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount bankAccount=new BankAccount();
        FixedDepositAccount fix=new FixedDepositAccount();
        SavaingAccount savaingAccount=new SavaingAccount();
        while(true) {
            System.out.println("enter your initial balance please");
            bankAccount.balance = sc.nextDouble();
            if(bankAccount.balance>10000){
                break;
            }else{
                System.out.println("please  balance must be greater than 10k for your bank to be active");
            }
        }


        while (true) {
            System.out.println("enter the amount you want to withdraw");
            double amount=sc.nextDouble();
            if(amount>0){
              bankAccount.withdraw(amount);
              break;
            }else{
                System.out.println("please try again");
            }
        }
        while (true) {
            System.out.println("enter the amount you want to deposit");
            double amount=sc.nextDouble();
            if(amount>0){
                bankAccount.deposit(amount);
                break;
            }else{
                System.out.println("please try again");
            }
        }
        while(true){
            System.out.println("enter money you want to transfer");
            double amount= sc.nextDouble();
            if(amount>0 && amount< bankAccount.balance){
                bankAccount.transferFunds(amount);
                break;
            }else{
                System.out.println("try again");
            }
        }
        while(true){
            System.out.println("enter the account yo want to send money");
            bankAccount.accountNumber=sc.nextInt();
            if(bankAccount.accountNumber==1234567){
                break;
            }else{
                System.out.println("try again");
            }
        }
        while (true){
            System.out.println("enter the balance you have in fixed account");
            fix.balance=sc.nextDouble();
            if(fix.balance>20000 ){
                break;
            }else{
                System.out.println("try gain please");
            }
        }
        while (true) {
            System.out.println("enter money yu want to withdraw within fixed account");
            fix.amount = sc.nextDouble();
            if (fix.amount > 0 && fix.amount < fix.balance) {
                break;
            } else {
                System.out.println("try again");
            }
        }
        while (true){
            System.out.println("enter period");
            double period=sc.nextDouble();
            if(period>5){
                fix.withdraw(period);
                break;
            }else{
                System.out.println("try again");
            }
        }
        while(true){
            System.out.println("enter the amount you want to wihdraw from saving account");
            double amount=sc.nextDouble();
            if(amount>10000 && amount<= bankAccount.balance){
                savaingAccount.withdraw(amount);
                break;
            }else{
                System.out.println("try again");
            }
        }


    }
}
