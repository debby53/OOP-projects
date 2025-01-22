public class Payroll {
    int empId;
    String empFname;
    String empLname;
    int Salary;
    static String institutionName;

    static {
        institutionName = "auca";
    }

    public    void displayInfo(){
        System.out.println( empId +" "+empLname+""+empFname);

    }





    public static void main(String[] args) {
        Payroll p1=new Payroll();
        Payroll p2=new Payroll();
        Payroll p3=new Payroll();
        p1.empFname="debby";
        p1.empId=2344;
        p1.empLname="ish";
        p1.Salary=500;
        p1.displayInfo();




    }
}
