package SuperSad;

import java.util.Scanner;

public class TaxDeclaration {
    private String taxPayerName;
    private double income;
    private double taxRate;
    private double taxAmount;
    private boolean isPaid;

    public String getTaxPayerName() {
        return taxPayerName;
    }

    public void setTaxPayerName(String taxPayerName) {
        this.taxPayerName = taxPayerName;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        if (income >= 0) {
            this.income = income;
        } else {
            System.out.println("please input income above zero");
        }
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        if (taxRate == 0.18 || taxRate == 0.3) {
            this.taxRate = taxRate;
        } else {
            System.out.println("the tax rate is 0.18 or 30%");
        }
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {

        this.taxAmount = taxAmount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void payTax() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the tax you are going to pay");
        String taxName = sc.nextLine();
        double caTaxAmount;
        if (taxName.equalsIgnoreCase("VAT")) {
            caTaxAmount = income * 0.18;
            setTaxAmount(caTaxAmount);
            System.out.println("calculate VAT " + getTaxAmount());
        }

        else if (taxName.equalsIgnoreCase("income tax")) {
            caTaxAmount = income * 0.3;
            setTaxAmount(caTaxAmount);
            System.out.println("calculate income amount "+getTaxAmount());
        } else {
            System.out.println("the tax rate you entered does not exist");
        }

    }


    public void declaration() {
        System.out.println("tax declaration salary:");
        System.out.println(" your name" + taxPayerName);
        System.out.println("income " + income);
        System.out.println("tax rate " + (taxRate*100) + "%");
        System.out.println("tax amount " + taxAmount);
        System.out.println("Payment Status: " + (isPaid ? "Paid" : "Not Paid"));



    }


    public void validation() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter income amount");
            double amountIncome = sc.nextDouble();
            if (amountIncome >= 0) {
                setIncome(amountIncome);
                break;
            } else {
                System.out.println("try gain please inputting income");
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TaxDeclaration tax1=new TaxDeclaration();
        TaxDeclaration tax2=new TaxDeclaration();
        System.out.println("enter your name");
        tax1.setTaxPayerName(sc.nextLine());


        tax1.validation();
        tax1.payTax();

        System.out.println("have you paid tax(yes/no)");
        String paidStatus=sc.nextLine();
        tax1.setPaid(paidStatus.equalsIgnoreCase("yes"));
        tax1.declaration();



    }
}





