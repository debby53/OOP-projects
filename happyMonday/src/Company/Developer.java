package Company;

public class Developer extends  Employee {
    String programingLanguage;

    @Override
    public void work() {
        System.out.println("i write this programming lungauges"+programingLanguage);
    }
    public void calculateSalary(double salary) {
        System.out.println("your salary as a programmer is "+salary);

    }
}
