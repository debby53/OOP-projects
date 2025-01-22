package OOP;
import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter coefficient a");
        double a =sc.nextDouble();
        System.out.println("enter coefficient b");
        double b =sc.nextDouble();
        System.out.println("enter coefficient c");
        double c = sc.nextDouble();
        double determinant=(b*b)-(4*a*c);
        double root1;
        double root2;
        if(determinant>0) {
            root1 =(-b - Math.sqrt(determinant))/(2*a);
            root2 =(-b + Math.sqrt(determinant))/(2*a);
            System.out.println("roots have different values");
            System.out.println("root1 = " + root1);
            System.out.println("root2 = " + root2);

        } else if (determinant==0) {
            root1 =(-b)/(2*a);
            System.out.println("roots are equal");
            System.out.println("root = "+root1);


        }else
            System.out.println("roots are complex and imaginary");

    }
}
