package Company;

public class Manager extends Employee{
    int teamSize;
    double bonus;

    @Override
    public void work() {
        System.out.println("team size you want to make is "+teamSize);

    }
    public void calculateSalary(double salary) {
        salary+=bonus;
        System.out.println("your monthly salary is "+salary);

    }
}
