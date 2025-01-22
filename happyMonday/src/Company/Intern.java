package Company;

public class Intern extends Employee{
    int duration;

    @Override
    public void work() {
        System.out.println("i will be traning for this duration"+duration);
    }

    @Override
    public void takeBreak() {
        System.out.println("i will be taking break of two hours");
    }
    public void calculateSalary(String salary) {
        System.out.println("the salry of intern is "+salary);

    }
}
