package EMPLOYEE_MANAGEMENT_SYSTEM;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int employeeId, double baseSalary, int teamSize) {
        super(name, employeeId, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateSalary() {
        double bonus=teamSize*200;
        return  getBaseSalary()+bonus;
    }

    @Override
    public void getPaySlip() {
        System.out.println("Developer pay slip");
        System.out.println("the name is "+getName());
        System.out.println("employee id "+getName());
        System.out.println("base salary "+getBaseSalary());
        System.out.println("teamsize "+teamSize);
        System.out.println("total salary "+calculateSalary());
    }
}
