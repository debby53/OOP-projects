package PAYROLL_SYSYTEM;

public class ContractualEmployee implements Payroll {
    int id;
    String fName;
    int age;
    String department;
    int years;
    double pension=0.02;
    double Maternity =0.026;
    String lName;
    String date;

    public ContractualEmployee(int id, String fName, int age, String department, int years,String lName,String date) {
        this.id = id;
        this.fName = fName;
        this.age = age;
        this.department = department;
        this.years = years;
        this.lName=lName;
        this.date=date;
    }

    @Override
    public void calculatePerment(double salary) {

    }

    @Override
    public void calculateCasual(double salary) {

    }

    @Override
    public void calculateContactual(double salary) {
        if(salary<500000){
            salary-= salary-= (salary*0.02) + (salary*0.026);
                System.out.println("the salary is "+salary);
            }else{
            System.out.println("for this employee salary range is below 500k");

            }
        }

    @Override
    public void displayEmpDetails() {
        System.out.println("----------------employee details for contractual employee-------------");
        System.out.println("the employee id  for casual employee is "+id);
        System.out.println("the employee first name and last name is "+ fName);
        System.out.println("last name is "+lName);
        System.out.println("the age is "+age);
        System.out.println("years of experience is "+years);
        System.out.println("the department is "+department);
        System.out.println("the deduction is "+pension + " and " + Maternity);
        System.out.println("==========================================================");

    }

}

