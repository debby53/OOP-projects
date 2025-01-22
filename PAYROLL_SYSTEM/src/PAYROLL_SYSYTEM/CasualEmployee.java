package PAYROLL_SYSYTEM;

public class CasualEmployee implements Payroll {
    int id;
    String fName;
    String lName;
    int age;
    String department;
    int years;
    double pension=0.02;
    double Maternity =0.026;
    String date;


    public CasualEmployee(int id, String fName, int age, String department, int years,String lName,String date) {
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
        if(salary>=700000 && salary<=850000){
            salary-= (salary*0.02) + (salary*0.026);
            System.out.println("the salry for casual is "+salary);

        }else{
            System.out.println("the salary cannot go below 700,000 and 850k");
        }

    }

    @Override
    public void calculateContactual(double salary) {

    }

    @Override
    public void displayEmpDetails() {
        System.out.println("----------------employee details for casual employee-------------");
        System.out.println("the employee id  for casual employee is "+id);
        System.out.println("the employee first name  is "+ fName);
        System.out.println("the last name is "+ lName);
        System.out.println("the age is "+age);
        System.out.println("years of experience is "+years);
        System.out.println("the department is "+department);
        System.out.println("the deduction is " + pension +  " for pension "  + " and " + Maternity + "for maternity");
        System.out.println("date is "+date);


        System.out.println("=======================================================");
    }


}
