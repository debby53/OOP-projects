package EMPLOYEE_MANAGEMENT_SYSTEM;

public class Developer extends Employee{
   private int complicatedProjects;

    public Developer(String name, int employeeId, double baseSalary, int complicatedProjects) {
        super(name, employeeId, baseSalary);
        this.complicatedProjects = complicatedProjects;
    }

    public int getComplicatedProjects() {
        return complicatedProjects;
    }

    public void setComplicatedProjects(int complicatedProjects) {
        this.complicatedProjects = complicatedProjects;
    }

    @Override
    public double calculateSalary() {
        double bonus=complicatedProjects*500;
        return bonus+getBaseSalary();
    }

    @Override
    public void getPaySlip() {
        System.out.println("developer pay slip");
        System.out.println("name "+getName());
        System.out.println("employeeid "+getEmployeeId());
        System.out.println("base salary "+getBaseSalary());
        System.out.println("projects complited "+complicatedProjects);
        System.out.println("total salary "+calculateSalary());

    }
}
