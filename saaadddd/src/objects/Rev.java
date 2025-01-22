package objects;

public class Rev {

    int id;
    int age;
    String name;

    public Rev(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public boolean isOlder(Rev student){
        if(this.age>student.age  )
            return true;
        else
            return false;
    }
    public Rev(Rev student){
        this.id= student.id;
        this.age=student.age;
        this.name=student.name;

    }
          Rev duplicate(){
        Rev temp=new Rev(this.age,this.id,this.name);
                return temp;
    }
    public void display(){
        System.out.println("student id is "+id + " the age is "+age + " and the name is " +name);
    }
    public static boolean hasSameName( Rev student1 , Rev student2 ){
        if(student1.name==student2.name)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Rev student1=new Rev(25689,20,"debby");
        Rev student2=new Rev(26567,32,"keza");
        Rev student3=new Rev(student2);
        Rev student4=student1.duplicate();

        if(student1.isOlder(student2)){
            System.out.println("student 1 is older than student 2");
        }
        else {
            System.out.println("student 2 is older than student 1");
        }
        if(Rev.hasSameName(student1,student2)){
            System.out.println("student 1 and student 2 has same names");
        }
        else{
            System.out.println("both student 1 and studen 2 has different names");
        }


        student1.display();
        student4.display();
        student3.display();
        student2.display();








    }

}
