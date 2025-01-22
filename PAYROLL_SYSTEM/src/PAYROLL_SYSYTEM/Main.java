package PAYROLL_SYSYTEM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("welcome to the payroll System--------------------");
        System.out.println("employee permanent details ");




           try {
               int id;
               while (true) {
                   System.out.println("enter employee id ");

                       id = sc.nextInt();
                       if (id < 0) {
                           break;

                       } else {
                           System.out.println("please try again id cannot be negative");
                       }

               }


               String name;
               while (true) {
                   System.out.println("enter first name  ");
                    name = sc.nextLine();
                   if (!name.isEmpty() || name == null) {
                       break;
                   } else {
                       System.out.println("the name cannot be empty , plz try again");
                   }
               }
               String lName;
               while (true) {
                   System.out.println("enter last  name  ");
                   lName = sc.nextLine();
                   if (!lName.isEmpty() || lName == null) {
                       break;
                   } else {
                       System.out.println("the name cannot be empty , plz try again");
                   }
               }

               int age;
               while (true) {
                   System.out.println("age");
                    age = sc.nextInt();
                   if (age >= 20 && age <= 65) {
                       break;
                   } else {
                       System.out.println("age cannot go below 20 or above 65 years try again");
                   }
               }
               int years;
               while (true) {
                   System.out.println("enter years of experience");
                    years = sc.nextInt();
                   if (years >= 5) {
                       break;
                   } else {
                       System.out.println("minimum yeras is 5 and above");
                   }
               }
               String department;
               while (true) {
                   System.out.println("enter your department");
                    department = sc.nextLine();
                   if (department.equalsIgnoreCase("Accounting") || department.equalsIgnoreCase("Planning") || department.equalsIgnoreCase("Strategy") || department.equalsIgnoreCase("Resources")) {
                       break;

                   } else {
                       System.out.println("plz trya gain ,");
                   }
               }
               System.out.println("enter date");
               String date=sc.nextLine();



               PermanentEmployee permanentEmployee = new PermanentEmployee(id,name,age,department,years,lName,date);
               CasualEmployee casualEmployee = new CasualEmployee(id,name,age,department,years,lName,date);
               ContractualEmployee contractualEmployee = new ContractualEmployee(id,name,age,department,years,lName,date);
               double salary;
               while (true) {
                   System.out.println("enter salary for permanent employee");
                    salary = sc.nextDouble();
                   if (salary >= 1000000 && salary <= 1500000) {
                       permanentEmployee.calculatePerment(salary);
                       break;
                   } else {
                       System.out.println("salary must be of this range plz try again");
                   }

               }
               while (true) {
                   System.out.println("enter salary for  casual employee");
                    salary = sc.nextDouble();
                   if (salary >= 700000 && salary <= 850000) {
                       casualEmployee.calculateCasual(salary);
                       break;
                   } else {
                       System.out.println("salary must be of this range plz try again");
                   }

               }
               while (true) {
                   System.out.println("enter salary for  contractual  employee");
                    salary = sc.nextDouble();
                   if (salary < 500000) {
                       contractualEmployee.calculateContactual(salary);
                       break;
                   } else {
                       System.out.println("salary must be of this range plz try again");
                   }


               }
               permanentEmployee.displayEmpDetails();
               contractualEmployee.displayEmpDetails();

               casualEmployee.displayEmpDetails();
           }catch (Exception e){
               System.out.println("error "+ e.getMessage());
           }

        }
    }

