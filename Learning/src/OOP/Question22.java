package OOP;
import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter quantity");
        int Quantity= sc.nextInt();
        System.out.println("Enter price per item");
        double pricePerItem= sc.nextDouble();
        double totalPrice= Quantity*pricePerItem;
        if(Quantity>100)
            totalPrice= totalPrice*0.90;
        System.out.println("the total expense is :"+totalPrice);
    }
}
