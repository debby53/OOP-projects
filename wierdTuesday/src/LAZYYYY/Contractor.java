package LAZYYYY;

public class Contractor extends  Employee{
    int hourlyRate;
    int hoursWorked;

    public Contractor(int id, String name, String department, int hoursWorked, int hourlyRate) {
        super(id, name, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }




    @Override
    public void work() {
        System.out.println(name + " is working as a contractor.");
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked; // unique salary calculation for contractor
    }

}
