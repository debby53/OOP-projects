package QUIZZZZ2222;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BusinessClassBooking businessClassBooking = new BusinessClassBooking();
        EconomicClassBooking economicClassBooking = new EconomicClassBooking();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        businessClassBooking.name = sc.nextLine();

            System.out.println("entr your gender");
            businessClassBooking. gender = sc.nextLine();




            System.out.println("enter your destination");
            businessClassBooking . destination = sc.nextLine();

        System.out.println("enter your location");
        businessClassBooking.location = sc.nextLine();
        while (true) {

            System.out.println("enter your age");

            int age = sc.nextInt();
            if (age > 0) {
                break;
            } else {
                System.out.println("the age should be above 0");


            }
        }
        while(true) {
            System.out.println("enter price");
            double price=sc.nextDouble();
            if(price>0){
                businessClassBooking.applyDiscount(price);
                break;
            }else{
                System.out.println("the price should be above 0");
            }
        }
        businessClassBooking.getDetails();
        businessClassBooking.bookTicket();
        businessClassBooking.applyDiscount(5000);
        Discountable booking=new BusinessClassBooking();

    }
}