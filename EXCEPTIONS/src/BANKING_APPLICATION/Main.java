package BANKING_APPLICATION;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String name = "";
            while (name==null || name.trim().isEmpty()){
                System.out.println("enter account holder name");
                name=sc.nextLine();
                if(name==null || name.trim().isEmpty()){
                    System.out.println(" error ! the account holder name cannot be empty or null");
                }
            }
            String accountNumber="";
            while(accountNumber==null || accountNumber.trim().isEmpty()){
                System.out.println("enter your account number");
                accountNumber=sc.nextLine();
                if(accountNumber==null || accountNumber.trim().isEmpty()){
                    System.out.println("error! account number cannot be null or empty");
                }
            }
            double balance=-1;
            while (balance<100000){
                System.out.println("enter balance");
                try {
                    balance=Double.parseDouble(sc.nextLine());
                    if(balance<100000){
                        System.out.println("the balance cannot be below 100k plz try again");
                    }
                }catch (NumberFormatException e){
                    System.out.println("an error occured ");
                }

            }
            double overdraftLimit=-1;
            while (overdraftLimit<0){
                System.out.println("enter overdraft limit");
                try {
                    overdraftLimit=Double.parseDouble(sc.nextLine());
                    if(overdraftLimit<0){
                        System.out.println("overdraft cannot go below 0 try again");
                    }
                }catch (NumberFormatException e){
                    System.out.println("error occured invalid input");
                }
            }
            CheckingAccount checkingAccount=new CheckingAccount(accountNumber,name,balance,overdraftLimit);
            SavingsAccount savingsAccount=new SavingsAccount(accountNumber,name,balance);
            FixedDeposit fixedDeposit=new FixedDeposit(accountNumber,name,balance);

            while(true){
                System.out.println("enter amount you want to withdraw within checking account");
                try {
                    double amount=Double.parseDouble(sc.nextLine());
                    if(amount>(checkingAccount.getBalance())+overdraftLimit){
                        System.out.println("reached overdraft limit try again");


                    }else {

                        checkingAccount.withdraw(amount);
                    }
                    break;
                }catch (NumberFormatException e){
                    System.out.println("error occured invalid input");
                }
            }
            while(true){
                System.out.println("enter money you want to deposit in Checking balance");
                try {
                    double amount=Double.parseDouble(sc.nextLine());
                    if(amount>100){
                     checkingAccount.deposit(amount);
                     break;
                    }else {
                        System.out.println("plz try again");
                    }
                }catch (NumberFormatException e){
                    System.out.println("error ");
                }
            }


            while(true){
                System.out.println("enter money you want to deposit in saving account");
                try {
                    double amount=Double.parseDouble(sc.nextLine());
                    if(amount>100){
                        savingsAccount.deposit(amount);
                        break;
                    }else {
                        System.out.println("plz try again");
                    }
                }catch (NumberFormatException e){
                    System.out.println("error ");
                }
            }

            while(true){
                System.out.println("enter money you want to deposit in fixed deposit");
                try {
                    double amount=Double.parseDouble(sc.nextLine());
                    if(amount>100){
                        fixedDeposit.deposit(amount);
                        break;
                    }else {
                        System.out.println("plz try again");
                    }
                }catch (NumberFormatException e){
                    System.out.println("error ");
                }
            }

          savingsAccount.withdraw(400);
            fixedDeposit.withdraw(600);
            savingsAccount.checkBalance();
            checkingAccount.checkBalance();
            fixedDeposit.checkBalance();






        }catch (Exception e){
            System.out.println("error "+e.getMessage());
        }finally {
            sc.close();
        }
    }
}
