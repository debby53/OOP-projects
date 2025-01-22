package QUIZZZ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        int age=0;
        while(true) {
            System.out.println("enter your age");
             age=sc.nextInt();
            if(age>0){
                break;
            }else{
                System.out.println("try again");
            }
        }
        String destination="";
        while(true){
            System.out.println("enter destination");
            destination=sc.nextLine();
            if(destination.equalsIgnoreCase("Doha")|| destination.equalsIgnoreCase("Johannesburg")){
                break;
            }else{
                System.out.println("try again");
            }
        }
        String gender="";
        while(true){
            System.out.println("enter gender");
             gender=sc.nextLine();
            if(gender.equalsIgnoreCase("female")|| gender.equalsIgnoreCase("male")){
                break;
            }else {
                System.out.println("try agin");
            }
        }

        while(true){
            System.out.println("enter location");
            String location=sc.nextLine();
            if(location.equalsIgnoreCase("musanze")|| location.equalsIgnoreCase("rusizi")){
                BusinessClassBooking businessClassBookin=new BusinessClassBooking(name,location,destination,"Business",gender,age);
                businessClassBookin.applyDiscount(5000);
                businessClassBookin.bookTicket();
                businessClassBookin.getDetails();
                break;
            }else{
                EconomicClassBooking economicClassBooking=new EconomicClassBooking(name,location,destination,"economic",gender,age);
                economicClassBooking.applyDiscount(8000);
                economicClassBooking.bookTicket();
                economicClassBooking.getDetails();
                break;
            }
        }


    }
}
