public class Repeat {
    int stdId;
    int age;
    int salary;
    String name;
    static String schoolName;
    static {
        schoolName="auca";
    }
public Repeat(){
        this(26568,20,"deborah");
}
    public Repeat(int stdId, int age, String name) {
        this.stdId = stdId;
        this.age =age ;
        this.name = name;
    }
    public void getInfo(){
        System.out.println(stdId);
        System.out.println(age);
        System.out.println(name);
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public boolean isGreater(){
        if(this.salary>5000)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Repeat r1=new Repeat();
        Repeat r2=new Repeat();
        r1.setSalary(4000);
        r2.setSalary(5000);
        r1.getInfo();
        if(r1.salary>5000){
            System.out.println("maximum");
        }
        else{
            System.out.println("min");
        }





    }
}
