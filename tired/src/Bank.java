import java.util.Scanner;

public class Bank {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private String accountType;
    private String bankName;

    public Bank() {
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("the balance must be above 0");
        }

    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double deposit(double amount) {


        double remainingBalance = balance + amount;
        if (amount >= 100) {
            System.out.println("deposit allowed");
            System.out.println("the remaining balance is " + remainingBalance);
        } else {
            System.out.println("no deposit the money should be 100 and above");
        }
        return amount;

    }

    public double withdraw(double amount) {
        double remainingBalance = balance - amount;
        if (remainingBalance >= 1000) {
            System.out.println("withdraw allowed");
            System.out.println("the remaining money after withdraw is " + remainingBalance);
        } else {
            System.out.println("withdraw not allowed");
        }
        return amount;
    }

    public void validation() {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("enter the balance your balance");
            double enteredBalance = sc.nextDouble();
            if (enteredBalance >= 0) {
                setBalance(enteredBalance);
                break;
            } else {
                System.out.println("balance cannot be negative");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.println("enter account holder name");
        String name = sc.nextLine();
        bank.setAccountHolderName(name);

        sc.nextLine();
        bank.validation();
        while(true) {
            System.out.println("enter  money for deposit");
            double money = sc.nextDouble();
            if (money>=0) {
                bank.deposit(money);
                break;
            }else{
                System.out.println("please try agin these amount does not exist");
            }

        }

        while(true) {
            System.out.println("enter  money for withdraw");
            double money1 = sc.nextDouble();
            if (money1>=0) {
                bank.withdraw(money1);
                break;
            }else{
                System.out.println("please try again these amount does not exist");
            }

        }


        }
    }
