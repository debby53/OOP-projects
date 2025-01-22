package LAZYYYY;

public class Manager extends Employee{
    int teamSize;
    int bonus;

    public Manager(int id, String name, String department, int teamSize, int bonus) {
        super(id, name, department);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }



    @Override
    public void work() {
        System.out.println("the manager is managing team size of "+teamSize +"of people");
    }

    @Override
    public double calculateSalary() {
        return 5000+bonus;
    }
}
