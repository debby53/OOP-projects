package Midterm;

public class BankAccount {
   private String accountHolderName ;
   private String accountNumber ;
   private double balance;
   private String  accountType;
   private String bankName;

    public BankAccount(String accountHolderName, String accountNumber, double balance, String accountType, String bankName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.bankName = bankName;
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
        this.balance = balance;
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
    public void depositMoney(double amount) {
        if (amount > 100) {
            System.out.println("deposit done");
        } else {
            System.out.println("no deposit");

        }
    }
        public void withdrawMoney(double amount){
            if(balance-amount>=1000){
                System.out.println("u can withdraw");
            }else{
                System.out.println("no withdraw");
            }
        }
        public void displayInfo() {
            System.out.println("accountholder is " + accountHolderName);
            System.out.println("account number " + accountNumber);
            System.out.println("current balance " + balance);
            System.out.println("bank name " + bankName);
            System.out.println("account type " + accountType);
        }

    public static void main(String[] args) {
        BankAccount b=new BankAccount("debby","b123gg",10000,"saving","BK");
        b.displayInfo();
        b.depositMoney(90);
      b.withdrawMoney(10000);
    }
}
