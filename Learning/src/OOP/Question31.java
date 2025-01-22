package OOP;
import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number= sc.nextInt();
        int absoluteValue=Math.abs(number);
        System.out.println("the absolute value of "+number + " is " +absoluteValue);
    }
}
