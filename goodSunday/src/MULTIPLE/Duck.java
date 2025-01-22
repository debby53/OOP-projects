package MULTIPLE;

import java.sql.SQLOutput;

public class Duck implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.println("the duck is swimming");
    }

    @Override
    public void swim() {
        System.out.println("the duck is flying");

    }
}
