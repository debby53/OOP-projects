package AIR_TICKET_BOOKING;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        while(true){
            try{

                System.out.println("enter your name");
                String name=sc.nextLine();
                String gender;
                while (true) {

                    System.out.println("enter your gender");
                     gender = sc.nextLine();
                     if(gender.equalsIgnoreCase("female")|| gender.equalsIgnoreCase("male")){
                         break;
                     }else{
                         System.out.println("try again");
                     }
                }
                int age;
                while (true) {
                    System.out.println("enter your age");
                    age = sc.nextInt();
                    if (age > 0) {
                        break;
                    } else {
                        System.out.println("please try again");
                    }
                }
                sc.nextLine();
                System.out.println("Enter your location:");
                String location = sc.nextLine();


                System.out.println("Enter your destination (Doha/Johannesburg):");
                String destination = sc.nextLine();

                if(!destination.equalsIgnoreCase("Doha") &&  !destination.equalsIgnoreCase("Johannesburg")){
                    System.out.println("Invalid destination! Please try again.");
                    continue;
                }
                double price;
                while (true) {
                    System.out.println("enter price");
                    price = sc.nextDouble();
                    if(price>0){
                        break;
                    }else{
                        System.out.println("please try again");
                    }
                }
                sc.nextLine();
                System.out.println("Gender: " + gender + ", Age: " + age); // Debugging line to verify input
                System.out.println("Original Price: " + price); // Debugging line to verify price


                if(location.equalsIgnoreCase("musanze")|| destination.equalsIgnoreCase("rusizi")){
                  BusinessClassBooking  booking=new BusinessClassBooking(name,location,destination,"business",gender,age,price);
                  booking.applyDiscount();
                    System.out.println("Price after discount (business): " + booking.getPrice());
                  booking.bookTicket();
                  booking.getDetails();
                }else{
                  EconomicClassBooking bookingg=new EconomicClassBooking(name,location,destination,"economic",gender,age,price);
                  bookingg.applyDiscount();
                    System.out.println("Price after discount (Economic): " + bookingg.getPrice());
                  bookingg.bookTicket();
                  bookingg.getDetails();
                }





                break;

            } catch (Exception e) {
                System.out.println("invalid input try again");
                sc.nextLine();
            }
        }
    }
}
