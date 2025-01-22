public class LoanQuest {
    private String clientName;
     private  double       salary
    private double loanAmount;
     private double interestRate = 10/100;
     private int loanPeriod ;

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
        if(salary>=5000000) {
            this.salary = salary;
        }else{
            System.out.println("salary must be greater than ");
        }
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if(loanAmount>=0) {
            this.loanAmount = loanAmount;
        }else{
            System.out.println("only money that are above 0");
        }
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
        if(loanPeriod==1) {
            this.loanPeriod = loanPeriod;
        }else{
            System.out.println("the maximum is one year");
        }
    }
    public double  payLoan(){
        

    }
}
