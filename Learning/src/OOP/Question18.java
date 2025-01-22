package OOP;
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your selling price");
        double sp= sc.nextDouble();
        System.out.println("enter your cost price");
        double cp= sc.nextDouble();
        double profit=sp-cp;
        double loss=sp-cp;
        if(sp>cp)

            System.out.println("you made profit of "+profit);
        else if (sp<cp) {
            System.out.println("you made loss of "+loss);


        }
        else
            System.out.println("no loss ,no profit");


    }
}
