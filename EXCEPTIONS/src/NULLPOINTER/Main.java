package NULLPOINTER;

public class Main {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();
        Dog dog=null;
        if(dog!=null) {
            careTaker.careForAnimal(dog);
        }else{
            System.out.println("we cannot accept null value");
        }

    }
}
/*A NullPointerException occurs when you try to access or modify an object reference that has not been initialized,
meaning it is null. This type of error can happen in any object-oriented language like Java
 */