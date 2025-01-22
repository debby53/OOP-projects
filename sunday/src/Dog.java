public class Dog {
    int age;
    String name;


    public Dog(){
        this(40,"Grace");
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public  void setName(String name){
        this.name=name;

    }
    public void display(){
        System.out.println(  " my Dog is " +name + " and its age "+age);
    }



    public static void main(String[] args) {
       Dog myDog=new Dog();
        myDog.display();


    }
}
