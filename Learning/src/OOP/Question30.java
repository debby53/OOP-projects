package OOP;
import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first angle");
        double angle1= sc.nextDouble();
        System.out.println("enter second angle");
        double angle2=sc.nextDouble();
        System.out.println("enter the third angle");
        double angle3 =sc.nextDouble();
        if(angle1 + angle2 + angle3 ==180 )
            System.out.println("this triangle is valid");
        else
            System.out.println("the angle is not valid");

    }
}
