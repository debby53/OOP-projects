package OOP;
import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("enter the age of Ram");
        int ramAge=keyboard.nextInt();
        System.out.println(" enter the age of shyam");
        int shyamAge = keyboard.nextInt();
        System.out.println("enter the age of Ajay");
        int ajayAge = keyboard.nextInt();
        if((ramAge<shyamAge)  && (ramAge<ajayAge))
            System.out.println("Ram is the youngest");
        else if ((shyamAge<ramAge) && (shyamAge<ajayAge)) {
            System.out.println("Shyam is the youngest");


        }else
            System.out.println("Ajay is the youngest");


    }
}
