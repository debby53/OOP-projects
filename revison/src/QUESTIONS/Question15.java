package QUESTIONS;
import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter coefficient a");
        int a = sc.nextInt();
        System.out.println("enter coefficient b");
        int b = sc.nextInt();

        System.out.println("enter coefficient c");
        int c = sc.nextInt();
        int determinant=(b*b-4*a*c);
        double root1;
        double root2;
        if(determinant>0) {
            root1 = (-b - Math.sqrt(determinant)) / 2 * a;
            root2 = (-b + Math.sqrt(determinant)) / 2 * a;
            System.out.println("the roots are distinct");
            System.out.println("the root1: " + root1);
            System.out.println("the root2: " + root2);
        } else if (determinant==0) {
            root1 = (-b/2*a);
            System.out.println("the roots are same");
            System.out.println("root: "+root1);

        }else
            System.out.println("the roots are imaginary");


    }
}
