package OOP;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write first side ");
        int side1= sc.nextInt();
        System.out.println("write second side ");
        int side2= sc.nextInt();
        System.out.println("write third side ");
        int side3= sc.nextInt();
        if(side1+side2>side3 && side1+side3>side2 &&side2+side3>side1)
            System.out.println("the triangle is valid");
        else
            System.out.println("invalid triangle");
    }
}
