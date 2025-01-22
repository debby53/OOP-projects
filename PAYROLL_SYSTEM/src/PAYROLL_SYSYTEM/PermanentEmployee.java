package PAYROLL_SYSYTEM;

public   class PermanentEmployee implements Payroll{
    int id;
    String fName;
    int age;
    String department;
    int years;
    double pension=0.02;
    double Maternity =0.026;
    double CGHI=0.05;
    String lName;
    String date;

    public PermanentEmployee(int id, String fName, int age, String department, int years,String lName,String date) {
        this.id = id;
        this.fName = fName;
        this.age = age;
        this.department = department;
        this.years = years;
       this.lName=lName;
       this.date=date;


    }

    double salary;
    @Override
    public void calculatePerment(double salary) {
     if(salary>=1000000 && salary<=1500000){
         salary -=  salary-= (salary*0.02) + (salary*0.026) +(salary*0.05);
         System.out.println("total salary after deduction is "+salary);
     }else{
         System.out.println("the salary range is 1M and 1500,000");
     }
    }

    @Override
    public void calculateCasual(double amount) {

    }

    @Override
    public void calculateContactual(double amount) {

    }

    @Override
    public void displayEmpDetails() {
        System.out.println("----------------employee details for permanent employee-------------");
        System.out.println("the employee id  for casual employee is "+id);
        System.out.println("the employee first name and last name is "+ fName);
        System.out.println("the age is "+age);
        System.out.println("years of experience is "+years);
        System.out.println("the department is "+department);
        System.out.println("yhe deduction are " + pension + " and " + Maternity + " and " + CGHI);

        System.out.println("=============================================");

    }
}
