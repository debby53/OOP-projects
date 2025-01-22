package BANKING_OPRATIONS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        if(age<0){
            System.out.println("invalid age provided "+age);
            throw new IllegalArgumentException("age cannot be negative");
        }

        try {
            String name = "";
            while (name.trim().isEmpty()) {
                System.out.println("enter accountholder name");
                name = sc.nextLine();
                if (name.trim().isEmpty()) {
                    System.out.println("the name should not be empty please try again");
                }
            }
            double balance = -1;
            while (balance < 100000) {
                System.out.println("enter you balance");
                try {
                    balance = Double.parseDouble(sc.nextLine());
                    if (balance < 100000) {
                        System.out.println("balance cannot go below 100k try again");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("invalid input");
                }
            }
            System.out.println("enter account number");
            String account = sc.nextLine();
            CheckingAccount checkingAccount = new CheckingAccount(account, name, balance);
            FixedDeposit fixedDeposit = new FixedDeposit(account, name, balance);
            SavingAccount savingAccount = new SavingAccount(account, name, balance);

            while (true) {
                System.out.println("enter amount you want to deposit in saving account");
                try {
                    double amount = Double.parseDouble(sc.nextLine());
                    if (amount > 1000) {
                        savingAccount.deposit(amount);
                        break;
                    } else {
                        System.out.println("try again");
                        throw new IllegalArgumentException("above please");
                    }
                }catch (NumberFormatException e){
                    System.out.println("Invalid input. Please enter a numeric value.");
                }
                }



            while (true) {

                    System.out.println("enter amount you want to withdrwa within saving account");

               try {
                   double amount = Double.parseDouble(sc.nextLine());
                   if (amount < savingAccount.getBalance()) {
                       savingAccount.withdraw(amount);
                       break;
                   } else {
                       System.out.println("try again");
                   }
               }catch (NumberFormatException e){
                   System.out.println("Invalid input. Please enter a numeric value.");
               }


            }
            double overdraftLimit = -1;
            while (overdraftLimit < 0) {
                System.out.println("Enter overdraft limit:");
                try {
                    overdraftLimit = Double.parseDouble(sc.nextLine());
                    System.out.println("Your overdraft limit is set to: " + overdraftLimit);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid numeric value.");
                }
            }

            // Money Transfer
            while (true) {
                System.out.print("Enter the amount you want to transfer: ");
                try {
                    double transferAmount = Double.parseDouble(sc.nextLine());
                    System.out.println("The money you want to transfer is: " + transferAmount);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid numeric amount.");
                }
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Program has ended. Scanner closed.");
        }
    }
}








