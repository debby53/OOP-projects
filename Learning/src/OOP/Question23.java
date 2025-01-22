package OOP;
import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter current year");
        int currentYear=sc.nextInt();
        System.out.println("enter join year");
        int joinYear=sc.nextInt();
        int bonus;
        int serviceYears=currentYear-joinYear;
        if(serviceYears>3) {
            bonus = 2500;
            System.out.println("the employee is eligible for bonus of "+bonus);
        }
        else
            System.out.println("the customer is not eligible for bonus");


    }
}
