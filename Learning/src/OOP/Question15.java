package OOP;
import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write first side ");
        int side1= sc.nextInt();
        System.out.println("write second side ");
        int side2= sc.nextInt();
        System.out.println("write third side ");
        int side3= sc.nextInt();
        if(side1==side2  &&side3==side2)
            System.out.println("it is equilateral triangle ");
        else if (side1==side2 ||side1==side3 || side2==side3) {
            System.out.println("it is isosceles triangle ");



        }else
            System.out.println("it is scalene triangle");
    }
}
