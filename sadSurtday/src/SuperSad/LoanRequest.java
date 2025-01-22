package SuperSad;

import java.util.Scanner;

public class LoanRequest {
    private String clientName;
    private double Salary;
    private double loanAmount;
    private double interestRate = 0.10;
    private int loanPeriod = 1;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        if (salary >= 5000000) {
            Salary = salary;
        } else {
            System.out.println("the salary should be more than 5M");
        }
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount >= 0) {
            this.loanAmount = loanAmount;
        } else {
            System.out.println("the loan amount should be above 0");
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
        if (loanPeriod > 0 && loanPeriod <= 12) {
            this.loanPeriod = loanPeriod;
        } else {
            System.out.println("loan period should not be greater than one year");
        }

    }
//    public void requestLoan(){
//       Scanner  sc=new Scanner(System.in);
//        System.out.println("first enter your name");
//        System.out.println("enter your salary");
//        double enteredSalary=sc.nextDouble();
//        setSalary(enteredSalary);
//        System.out.println("enter loan period");
//        int enteredLoanPeriod=sc.nextInt();
//        setLoanPeriod(enteredLoanPeriod);
//        System.out.println("enter the loan amount you want");
//        double enteredAmount=sc.nextDouble();
//        setLoanAmount(enteredAmount);
//
//    }
//    public void payLoan(double balance){
//
//
//    }
        public void validation(){
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("enter your salary");
                double salary1 = sc.nextDouble();
                if (salary1 >= 5000000) {
                    setSalary(salary1);
                    break;
                } else {
                    System.out.println("please try again for salary");
                }
            }
            while (true) {

                System.out.println("enter loan amount");
                double loanAmountt = sc.nextDouble();
                if (loanAmountt >= 0) {
                    setLoanAmount(loanAmountt);
                    break;
                } else {
                    System.out.println("please try again for loan amount");
                }
            }
            while (true) {

                System.out.println("enter your loan period");
                int loanPeriodd = sc.nextInt();
                if (loanPeriodd > 0 && loanPeriodd <= 12) {
                    setLoanPeriod(loanPeriodd);
                    break;
                } else {
                    System.out.println("please try again for loan period");
                }
            }
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            LoanRequest loan = new LoanRequest();
            System.out.println("enter your name please");
            String name = sc.nextLine();
            loan.setClientName(name);
            loan.validation();


        }
    }


