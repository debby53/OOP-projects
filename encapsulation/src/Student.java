import java.util.Scanner;

public class Student {
    private int id;
    private String fname;
    private  String lname;
    private  int age;
    private   int num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        if(id>25001){
            System.out.println("you are allowed");
            System.out.println("enter your name");

        }
       else {
            System.out.println("wrong id");

        }

    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student st =new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your id");
        int a=sc.nextInt();
        st.setId(a);
        System.out.println("enter your name");
        String fname=sc.nextLine();
        st.setFname(fname);
         st.getFname();
        st.getId();
        System.out.println(a);
        System.out.println(fname);

    }
}
