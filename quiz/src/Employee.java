import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private double bonus =0.05;
    private double transportAllowance=0.09;
    private  double houseAllowance=0.04;
     private double netSalary;
     double c;

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTransportAllowance() {
        return transportAllowance;
    }

    public void setTransportAllowance(double transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    public double getHouseAllowance() {
        return houseAllowance;
    }

    public void setHouseAllowance(double houseAllowance) {
        this.houseAllowance = houseAllowance;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your salary");
         double a=sc.nextDouble();

         Employee e1=new Employee();
         Employee e2=new Employee();
        if(a>=800000 && a<=850000){
            double m=((a*0.05)+(a*0.04)+(a*0.09));
            e1.setNetSalary(m);
           double o= e1.getNetSalary();
            System.out.println(o);


        }
        else{
            System.out.println("ur amount is more or less");
        }










    }
}
