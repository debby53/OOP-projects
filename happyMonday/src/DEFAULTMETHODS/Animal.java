package DEFAULTMETHODS;

public interface Animal {
    abstract void makeSound();
   default void sleep(){
       System.out.println("sleeping");
   }
}
