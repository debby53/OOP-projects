package OOP;
import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter physics marks");
        double phy =sc.nextDouble();
        System.out.println("enter chemistry marks");
        double chem =sc.nextDouble();
        System.out.println("enter biology marks");
        double bio =sc.nextDouble();
        System.out.println("enter mathematics marks");
        double math =sc.nextDouble();
        System.out.println("enter computer marks");
        double comp =sc.nextDouble();
        double total=phy+chem+bio+comp+math;
        double percentage= (total/500)*100;
        if(percentage>=60)
            System.out.println("first division");
        else if (percentage>=50) {
            System.out.println(" second division");
            
        } else if (percentage>=40) {
            System.out.println("third division");

        }else
            System.out.println("fail");
    }
}
