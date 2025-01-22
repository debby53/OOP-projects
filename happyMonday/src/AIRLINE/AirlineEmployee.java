package AIRLINE;

public class AirlineEmployee {
    private int employeeID;
    private String name;
    private double baseSalary;

    public AirlineEmployee(int employeeID, String name, double baseSalary) {

        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(){

        return 0.0;
    }
}
