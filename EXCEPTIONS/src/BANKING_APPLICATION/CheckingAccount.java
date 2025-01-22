package BANKING_APPLICATION;

public class CheckingAccount extends Account implements BankingOperations,LoanEligible{
    private  double overdraftLimit;

    public CheckingAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
       if(amount>100){
           setBalance(getBalance()+amount);
           System.out.println("amount well deposited "+amount +"the new balance is "+getBalance());

       }else {
           System.out.println("the amount to deposit starts from 100 and above");
       }
    }

    @Override
    public void withdraw(double amount) {
        if(amount>(overdraftLimit+getBalance())){
            System.out.println("reached overdraft limit");

        }else{
            setBalance(getBalance()-amount);
            System.out.println("the money withdrawn successfully " + amount +"the remaining balance is "+getBalance());
        }

    }

    @Override
    public void checkBalance() {
        System.out.println("the current balance on checking account is "+getBalance());

    }

    @Override
    public void applyForLoan(double loanAmount) {
        if(getBalance()>100000){
            System.out.println("loan allowed of "+loanAmount);
        }else {
            System.out.println("no loan allowed");
        }

    }

    @Override
    public void checkLoanStatus() {
        System.out.println("the loan status is being checked");
    }
}
