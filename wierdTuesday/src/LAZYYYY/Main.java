package LAZYYYY;

public class Main {
    public static void main(String[] args) {
        Developer developer=new Developer(2444,"debby","it","oop");
        Employee manager=new Manager(3444,"keza","nets",8,8000);
        Intern intern=new Intern(77777,"jey","business",20);
        Contractor contractor=new Contractor(26568, "adaya","soft",17,20);
        developer.work();
        manager.work();
        intern.work();
        contractor.work();

        manager.takeBreak();
        intern.takeBreak();



        System.out.println(manager.name + " salary"+manager.calculateSalary());
        System.out.println(developer.name+ "salary"+developer.calculateSalary());
        System.out.println(intern.name + "'s Salary: $" + intern.calculateSalary());
        System.out.println(contractor.name + "'s Salary: $" + contractor.calculateSalary());


    }



}
