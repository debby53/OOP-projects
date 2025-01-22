package EMPLOYEE_MANAGEMENT_SYSTEM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            String name="";
            while (name.trim().isEmpty()){
                System.out.println("enter name");
                name=sc.nextLine();
                if(name.trim().isEmpty()){
                    System.out.println("name cannot be empty plz try again");
                }
            }
            int employeeId=-1;
            while(employeeId<=0){
                System.out.println("enter employee id");
                try {
                    employeeId=Integer.parseInt(sc.nextLine());
                    if(employeeId<=0){
                        System.out.println("id cannot be 0.plz try again");

                    }
                }catch (NumberFormatException e){
                    System.out.println("invalid ouput, please put positive id");
                }
                }
            double baseSalary=-1;
            while (baseSalary<=0){
                System.out.println("enter basesalary");
                try {
                    baseSalary=Double.parseDouble(sc.nextLine());
                    if(baseSalary<=0){
                        System.out.println("salary cannot be negative");

                    }
                }catch (NumberFormatException e){
                    System.out.println("invalip input");
                }
            }
            int complitedProjects=-1;
            while (complitedProjects<=0){
                System.out.println("enter projects yo complited");
                try {
                    complitedProjects=Integer.parseInt(sc.nextLine());
                    if(complitedProjects<=0){
                        System.out.println("negative projects does not exist");

                    }
                }catch (NumberFormatException e){
                    System.out.println("invalid input");
                }
            }
            int teamSize=-1;
            while (teamSize<=0){
                System.out.println("enter team size");
                try {
                    teamSize=Integer.parseInt(sc.nextLine());
                    if(teamSize<=0){
                        System.out.println("team size cannot be 0");
                    }
                }catch (NumberFormatException e){
                    System.out.println("invalid input");
                }

            }
            Developer developer=new Developer(name,employeeId,baseSalary,complitedProjects);
            Manager manager=new Manager(name,employeeId,baseSalary,teamSize);
            System.out.println("*******developer infor---------------");
            developer.calculateSalary();
            developer.getPaySlip();
            System.out.println("*************manager info===============");
            manager.calculateSalary();
            manager.getPaySlip();
            } catch (Exception e) {
            System.out.println("error "+e.getMessage());
        }finally {
            sc.close();
        }


    }
}
