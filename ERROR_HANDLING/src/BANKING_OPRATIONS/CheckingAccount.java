package BANKING_OPRATIONS;

public class CheckingAccount extends Account implements BankingOperations,LoanEligible{
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount>(overdraftLimit+getBalance())){
            System.out.println("you ve reached overdraft limit withdrawn failed");
        }else {
            setBalance(getBalance()-amount);
            System.out.println("you have withdarwan "+amount + "remaining "+getBalance());
        }

    }

    @Override
    public void deposit(double amount) {
        if(amount>0){
            setBalance(getBalance()+amount);
            System.out.println("deposited "+amount +"remaining balance "+getBalance());
        }else {
            System.out.println("no deposit allowed");
        }

    }

    @Override
    public void checkBalance() {
        System.out.println("the balance is "+getBalance());
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("the loan request is under process "+loanAmount);
    }

    @Override
    public void checkLoanStatus() {
        System.out.println("the loans status is under review");
    }
}
