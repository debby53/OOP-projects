public class Over {
    int stdId;
    int age;
    String name;
    static String schoolName;
    static {
        schoolName= "auca";
    }

    public void getStudentInfo(){
        System.out.println("the id is " +   stdId);
        System.out.println("the age is " +    age);
        System.out.println("the name of school is "+     schoolName);
        System.out.println("the name is "+     name);


    }

    public static void main(String[] args) {
        Over o1=new Over();
        Over o2=new Over();
        o1.age=20;
        o1.stdId=25456;
        o1.name="Deborah";
        o1.getStudentInfo();



        o2.age=21;
        o2.stdId=23456;
        o2.name="keza";
        o2.getStudentInfo();



    }
}

