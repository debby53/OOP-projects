package OOP;
import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first angle");
        int angle1= sc.nextInt();
        System.out.println("enter the second angle");
        int angle2=sc.nextInt();
        System.out.println("enter the third angle");
        int angle3=sc.nextInt();
        if(angle1+angle2+angle3==180)
            System.out.println("this triangle is valid");
        else
            System.out.println("invalid triangle");
    }
}
