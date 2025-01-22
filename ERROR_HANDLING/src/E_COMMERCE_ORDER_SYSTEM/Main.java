package E_COMMERCE_ORDER_SYSTEM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            String name="";
            while (name.trim().isEmpty()){
                System.out.println("enter the product name");
                name=sc.nextLine();
                if(name.trim().isEmpty()){
                    System.out.println("the name cannot be empty.please try again");
                }
            }
            double price=-1;
            while (price<=5000){
                System.out.println("enter price for the product");
                try {
                    price=Double.parseDouble(sc.nextLine());
                    if(price<=5000){
                        System.out.println("the price cannot be negative, please try again");
                    }
                }catch (NumberFormatException e){
                    System.out.println("invalid input");
                }
            }
            double weightfileds=-1;
            while (weightfileds<=0){
                System.out.println("enter weight fields");
                try {
                    weightfileds=Double.parseDouble(sc.nextLine());
                    if(weightfileds<=0){
                        System.out.println("weiht filed cannnot be negative. please try again");
                    }
                }catch (NumberFormatException e){
                    System.out.println("invalid input ");
                }
            }
            Electronics electronics=new Electronics(name,price,weightfileds);
            Furniture furniture=new Furniture(name,price,weightfileds);

            String customerName="";
            while (customerName.trim().isEmpty()){
                System.out.println("enter customer name");
                customerName=sc.nextLine();
                if(customerName.trim().isEmpty()){
                    System.out.println("the customer name cannot be empty.plz try again");
                }
            }
            String email="";
            while (email.trim().isEmpty()){
                System.out.println("enter email of the customer");
                email=sc.nextLine();
                if(email.trim().isEmpty()){
                    System.out.println("email cannot be empty.plz try again");
                }
            }
            String address="";
            while (address.trim().isEmpty()){
                System.out.println("enter address of the customer");
                address=sc.nextLine();
                if ((address.trim().isEmpty())){
                    System.out.println("try again, address cannot be empty");
                }
            }
            Customer customer1=new Customer(customerName,email,address);
            Customer customer2=new Customer(customerName,email,address);
            System.out.println("-----------------furniture details-------");
            furniture.calculateShippingCost();
            furniture.getDeliveryTime();
            customer1.placeOrder(furniture);
            System.out.println("--------------electronics detsils--------");
            electronics.calculateShippingCost();
            electronics.getDeliveryTime();

            customer2.placeOrder(electronics);

        } catch (Exception e) {
            System.out.println("error "+e.getMessage());
        }finally {
            sc.close();
        }
    }
}
