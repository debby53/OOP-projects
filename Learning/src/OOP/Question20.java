package OOP;
import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter basic salary of an employee");
        double basicSalary=sc.nextDouble();
        double hra;
        double  da;
        double grossSalary;

        if(basicSalary<=10000) {
            hra = 0.20 * basicSalary;
            da = 0.80 * basicSalary;
        } else if (basicSalary<=20000) {
            hra=0.25*basicSalary;
            da=0.90*basicSalary;

        }else
            hra=0.30*basicSalary;
            da=0.95*basicSalary;
        grossSalary=(basicSalary+ hra +da);
        System.out.println("the gross salary is "+grossSalary);
    }
}
