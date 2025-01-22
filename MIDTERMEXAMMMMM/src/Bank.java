import java.util.Scanner;

public class Bank {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private boolean isActive;
    private double loanAmount;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
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
        if(balance>=0) {
            this.balance = balance;
        }else{
            System.out.println("please enter positive value");
        }
    }

    public boolean isActive() {
        return true;
    }

    public void setActive(boolean active) {
        isActive = isActive;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {



    }
    public String dayOfWeek(){
        String day="";
        if(day.equalsIgnoreCase("Monday")){

        }
        return day;
    }
    public double  withdraw(double amount){



        if(amount >=2000000 && dayOfWeek().equalsIgnoreCase("Monday")){

            System.out.println("withdraw allowed");
        } else {
            System.out.println("you have insufficient fund or the day of the week is not correct ");

        }

            return amount;

    }
    public double depositMoney(double amount){

        if (amount>=100 && isAccountActive() ){

            System.out.println("deposit allowed");

        }else{
            System.out.println("please money should be 100 or above");

        }
        return amount;
    }
    public int requestLoan(){
        if(balance>=50000){
            System.out.println("loan allowed");
            loanAmount= (balance*10);
            System.out.println("the loan allowed is "+loanAmount);
        }else{
            System.out.println("no loan allowed");
        }
return 0;
    }
    public boolean isAccountActive(){
        if(balance>=100) {

        }
        return true;
    }
    public static double validateAccount(Scanner sc, String  amountType){
        int value=-1;
        while(value<0 ){
            System.out.println("enter the amount");
            sc.nextInt();
            if(value<0){
                System.out.println("please try again the amount is less than  0");
            }
        }
        return value;

    }

    public static void main(String[] args) {
        Bank b=new Bank();
        Scanner sc=new Scanner(System.in);
        b.setBalance(20000);
        System.out.println("enter account holder name");
        b.setAccountHolder(sc.nextLine());
        System.out.println("enter account number");
        b.setAccountNumber(sc.nextLine());
        System.out.println("enter amount");
        double amount=sc.nextDouble();
        b.setBalance(amount);
        System.out.println("enter the day of the week you are going to withdraw money on");
        String dayOfTheWeek=sc.nextLine();
        sc.nextLine();



        b.withdraw(200000);
        b.depositMoney(600000);

        b.requestLoan();
    }
}
