package OOP;
import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee salary");
        double basicSalary=sc.nextDouble();
        double hra=0.0;
        double da=0.0;
        double grossSalary=basicSalary+hra+da;
        if(basicSalary<1500) {
            hra = 0.1 * basicSalary;
            da = 0.9 * basicSalary;
        } else if (basicSalary>=1500) {
            hra=500;
            da=0.98*basicSalary;
        }


        grossSalary=basicSalary+hra+da;
        System.out.println("gross salary is "+grossSalary);



    }
}
