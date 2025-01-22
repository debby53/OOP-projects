package OOP;
import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hardness");
        int hardness=sc.nextInt();
        System.out.println("enter carbon content");
        double carbonContent= sc.nextDouble();
        System.out.println("enter tensile strength");
        int tensileStrength=sc.nextInt();
        if(hardness>50 && carbonContent<0.7 && tensileStrength>5600)
            System.out.println("the grade is 10");
        else if (hardness>50 && carbonContent<0.7) {
            System.out.println("grade 9");

        } else if (carbonContent<0.7 && tensileStrength>5600) {
            System.out.println("the grade is 8");

        } else if (hardness>50 && tensileStrength>5600) {
            System.out.println("the grade is 7");

        } else if (hardness>50 || tensileStrength>5600 || carbonContent<0.7) {
            System.out.println("grade 6");

        }else
            System.out.println("grade 5");
    }
}

