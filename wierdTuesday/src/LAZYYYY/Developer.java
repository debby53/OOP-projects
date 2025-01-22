package LAZYYYY;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer(int id, String name, String department, String programmingLanguage) {
        super(id, name, department);
        this.programmingLanguage = programmingLanguage;
    }



    @Override
    public void work() {
        System.out.println("coding "+programmingLanguage);
    }

    @Override
    public double calculateSalary() {
        return 4000;
    }
}
