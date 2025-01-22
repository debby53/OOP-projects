public class Crazy {
     int id;
     String name;

    public Crazy(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Crazy(Crazy z){
        this.name= z.name;
        this.id=z.id;
    }
    public boolean isEqual(Crazy z){
        if(this.id== z.id && this.name==z.name)
            return true;
        else
            return false;
    }
    public void display(){
        System.out.println("the id is "+id + "the name "+ name);

    }
    public

    public static void main(String[] args) {
     Crazy z1=new Crazy(26568,"debby");
     Crazy z2=new Crazy(26567,"Alexia");
     Crazy z3=new Crazy(z1);
     if(z1.isEqual(z2)){
         System.out.println("student 1 and student 2 have same attribute");
     }else{
         System.out.println("student 1 and student 2 have different attribute");
     }
     z3.display();
     z1.display();

    }
}
