import java.util.Scanner;
import java.util.regex.Pattern;

public class BankAccount {
    private String name;
    private String accountNumber;
    private String typeOfAccount;
    private double balance;
    private String password;

    public BankAccount(String name, String accountNumber, String typeOfAccount, double balance,String password) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.typeOfAccount = typeOfAccount;
        this.balance = balance;
        setPassword(password);

    }
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
    private static final String DEFAULT_PASSWORD = "Auca@123";

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(Pattern.matches(PASSWORD_REGEX,password)) {

            this.password = password;
        }else{
            System.out.println("invalid password");
            this.password=DEFAULT_PASSWORD;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        if (typeOfAccount.equalsIgnoreCase("fixed") || typeOfAccount.equalsIgnoreCase("saving")) {
            this.typeOfAccount = typeOfAccount;
        } else {
            System.out.println("that account is not allowed");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>10000) {
            this.balance = balance;
        }else{
            System.out.println("the balance cannot go below 10k plz");
        }
    }
  public void deposit(double amount){
        if(amount>1000){
            balance+=amount;
            System.out.println("your money well deposited and the reamaining balance is "+balance);
        }else{
            System.out.println("we cannot deposit less amount to 1k");
        }

  }
  public void withdraw(double amount){
        if(amount<balance){
            balance-=amount;
            System.out.println("money well withdrawn from you account the remaining money is "+balance);
        }else {
            System.out.println("insufficient money");
        }

  }
public void display(){
    System.out.println("the name is "+name);
    System.out.println("the acoout type is "+typeOfAccount);
    System.out.println("the balence is "+balance);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            String password;
            while ((true)) {
                System.out.println("enter ur password atleast short,long and characters");
                password = sc.nextLine();
                if (Pattern.matches(PASSWORD_REGEX, password)) {
                    break;
                } else {
                    System.out.println("Invalid password format. Try again.");
                }

            }
            System.out.println("enter your name");
            String name=sc.nextLine();

            System.out.println("enter account type");
            String type=sc.nextLine();
            if(type.equalsIgnoreCase("fixed")|| type.equalsIgnoreCase("saving")){
                System.out.println("well to go");
            }else{
                System.out.println("account is either saving or fixed");
            }
            System.out.println("enter account nbr");
            String nbr=sc.nextLine();
            BankAccount bankAccount=new BankAccount(name,nbr,type,50000,password);


           while(true) {
               System.out.println("\n=====BANK MENU===");
               System.out.println("1.Deposit");
               System.out.println("2. Withdraw");
               System.out.println("3. Display Account Details");
               System.out.println("4. Exit");
               System.out.println("CHOOSE AN OPTION");
               try {
                   int choice=Integer.parseInt(sc.nextLine());
                   switch (choice){
                       case 1:
                           while ((true)){
                               try {
                                   System.out.println("enter your amount you want to deposit");
                                   double amount=Double.parseDouble(sc.nextLine());
                                   if(amount>1000){
                                       bankAccount.deposit(amount);
                                       break;
                                   }else{
                                       System.out.println("plz try again");
                                   }

                               } catch (NumberFormatException e) {
                                   System.out.println("error"+ e.getMessage());
                               }

                           }
                           break;
                       case 2:
                           while(true){

                               try {
                                   System.out.println("enter the amount you want to withdraw");
                                   double amount=Double.parseDouble(sc.nextLine());
                                   if(amount< bankAccount.getBalance()){
                                       bankAccount.withdraw(amount);
                                       break;
                                   }else{
                                       System.out.println("plz try again");
                                   }

                               } catch (NumberFormatException e) {
                                   System.out.println("error"+ e.getMessage());
                               }

                           }
                           break;
                       case 3:
                           bankAccount.display();
                           break;
                       case 4:
                           System.out.println("Thank you for using our banking system. Goodbye!");
                           sc.close();
                           return;
                       default:
                           System.out.println("Invalid choice! Please enter a number between 1 and 4.");



                   }
               }catch (NumberFormatException e){
                   System.out.println("Invalid input! Please enter a numeric choice.");
               }


           }



        } catch (Exception e){
            System.out.println("try again");
        }


    }



}

