package objects;

public class Me {
    int age;
    String name;

    public Me(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean isOlder(Me m){
        if(this.age> m.age)
            return true;
        else
            return false;
    }
    public Me(Me m){
        this.name= m.name;
        this.age= m.age;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
    public static boolean hasSameNmae(Me m1,Me m2){
        if(m1.name== m2.name)
            return true;
        else
            return false;
    }
    Me dupicate(){
        Me temp=new Me(this.name,this.age);
                return temp;
    }









    public static void main(String[] args) {
        Me m1=new Me("debby",21);
        Me m2=new Me("peace",22);
        Me m3=new Me(m1);
        Me m4=m2.dupicate();
        if(m1.isOlder(m2)){
            System.out.println("m1 is older than m2");
        }else{
            System.out.println("m2 is older than m1");
        }
        m3.display();
        m1.display();
        m4.display();
        m2.display();
        if(Me.hasSameNmae(m1,m2)){
            System.out.println("m1 and m2 has same names");
        }else{
            System.out.println("m1 and m2 has different names");
        }




    }
}
