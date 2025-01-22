package OOP;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of days the member returned the book");
        int days= sc.nextInt();
        if(days <=5)
            System.out.println("the fine is "+ (days*0.50) + "rupees");
        else if (days<=10) {
            System.out.println("the fine is "+((5*0.50)+(days-5)*1.00)+ "rupees");

        }
        else if (days<=30) {
            System.out.println("the fine is "+((0.50*5) +(5*1.00)+(days-10)*5.00)+ "rupees.");


        }else
            System.out.println("yoy membership is cancelled");
    }
}
