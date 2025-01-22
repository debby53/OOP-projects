package OOP;
import java.util.Scanner;
public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        double percentage;
        percentage=(( total/500) * 100);
        if(percentage>=90)
            System.out.println("Grade A");
        else if (percentage>=80) {
            System.out.println("Grade B");


        } else if (percentage>=70) {
            System.out.println("Grade C");

        } else if (percentage>=60) {
            System.out.println("Grade D");

        } else if (percentage>=40) {
            System.out.println("Grade E");

        } else if (percentage<40) {
            System.out.println("Grade F");


        }else
            System.out.println("failed");
    }
}
