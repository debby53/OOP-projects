package midterm;

public class LoanRequest {
    private String clientName;
    private double salary;
    private double loanAmount;
    private double interestRate = 0.10;  // Fixed interest rate of 10%
    private int loanPeriod;

    public LoanRequest(String clientName, double salary, double loanAmount, double interestRate, int loanPeriod) {
        this.clientName = clientName;
        this.salary = salary;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanPeriod = loanPeriod;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }
}
