package SYSTEM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        Clothing clothing = new Clothing();
        Electronics electronics = new Electronics();
        Gloceries gloceries = new Gloceries();
        while (true) {
            System.out.println("enter the product name");
            product.name = sc.nextLine();
            if (product.name != null) {

                break;
            } else {
                System.out.println("we dont allow null names or empty ones try again");
            }

        }
        while (true) {
            System.out.println("enter price");
            product.price = sc.nextDouble();
            if (product.price > 5000) {
                break;
            } else {
                System.out.println("try again");
            }
        }
        System.out.println("enter the product id");
        int productId=sc.nextInt();
        System.out.println("enter the electonics name");
        electronics.name=sc.nextLine();
        sc.nextLine();
        System.out.println("enter the the brand");
        electronics.brand=sc.nextLine();

        System.out.println("enter the warrant period");
        electronics.warrantyPeriod=sc.nextInt();




        product.getDiscountPrice();
        product.displayProuctDetail();
        electronics.getDiscountPrice();
        electronics.displayProuctDetail();
    }
}
