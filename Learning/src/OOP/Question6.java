package OOP;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year: ");
        int year = sc.nextInt();
        if((year%4 ==0 && year%100 !=0) || (year%400 ==0)){
            System.out.println("is a leap year");
        }
        else
            System.out.println("is not a leap year");

    }
}
