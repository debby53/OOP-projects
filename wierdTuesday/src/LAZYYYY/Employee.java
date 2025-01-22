package LAZYYYY;

public class Employee {
    int id;
    String name;
    String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void work(){
        System.out.println(" the employer "+name +"with ID "+id +"is working in department "+department);
    }
    public void takeBreak(){
        System.out.println("the break will be 30 minutes");

    }
    public double calculateSalary(){
        return 0.0;
    }


}
