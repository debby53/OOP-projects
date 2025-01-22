package Company;

import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee employee=new Employee();
        Developer developer=new Developer();
        Intern intern=new Intern();
        Manager manager=new Manager();
        Contractor contractor=new Contractor();
        System.out.println("enter emp name");

        employee.name=sc.nextLine();
        System.out.println("enter dev name");
        developer.name= sc.nextLine();
        while(true) {
            System.out.println("enter the salary of manger");
            double salary = sc.nextDouble();
            if(salary>0) {
                manager.calculateSalary(salary);
                break;
            }else{
                System.out.println("please try again ");
            }
        }
        System.out.println("lets display the company info");
        System.out.println("the employee name is "+employee.name);
        System.out.println("the developers name is "+developer.name);

    }
}
