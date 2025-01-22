package LAZYYYY;

public class Intern extends Employee{
    int duration;

    public Intern(int id, String name, String department, int duration) {
        super(id, name, department);
        this.duration = duration;
    }



    @Override
    public void work() {
        System.out.println("intern works for this duration while training"+duration);
    }

    @Override
    public void takeBreak() {
        System.out.println("intern takes 5 minutes of break");
    }

    @Override
    public double calculateSalary() {
        return 900;
    }
}
