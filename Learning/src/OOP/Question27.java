package OOP;
import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a five digit number");
        int number = sc.nextInt();
        int originalNumber=number;
        int reversedNumber=0;
        int raimander =0;
        while(number !=0) {
            raimander = number % 10;
            reversedNumber = reversedNumber * 10 + raimander;
            number = number / 10;
        }
        System.out.println("reversed number: "+reversedNumber);
        if(originalNumber==reversedNumber) {
            System.out.println("the original number is equal to the reversed number");
        }
        else
            System.out.println("they are not equal");
    }
}
