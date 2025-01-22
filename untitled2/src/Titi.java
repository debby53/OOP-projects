import java.sql.SQLOutput;
import java.util.Scanner;

public class Titi {
    private int id;
    private int age;
    private String name;
    private int id2;

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public static void main(String[] args) {
        Titi T1=new Titi();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur id");
        T1.setId(sc.nextInt());

        if(T1.id>25001){
            System.out.println("allowed");

            System.out.println("enter ur name");
           T1.setName(sc.nextLine());
           sc.nextLine();
            System.out.println("enter ur age");
           T1.setAge(sc.nextInt());
        }else{
            System.out.println("not allowed");
        }

        int c= T1.getId();
        System.out.println(c);

    }
}
