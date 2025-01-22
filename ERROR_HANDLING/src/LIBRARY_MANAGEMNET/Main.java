package LIBRARY_MANAGEMNET;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     try{
         System.out.println("wecome to the library management system");
         String bookTitle="";
         while(bookTitle.trim().isEmpty()){
             System.out.println("enter book titile");
             bookTitle=sc.nextLine();
             if(bookTitle.trim().isEmpty()){
                 System.out.println("book cannot be empty.please try again");
             }
         }
         int bookItemId=-1;
         while (bookItemId<=0){
             System.out.println("enter book item Id");
             try {
                 bookItemId=Integer.parseInt(sc.nextLine());
                 if(bookItemId<0){
                     System.out.println("id must be positive.try again");
                 }
             }catch (NumberFormatException e){
                 System.out.println("Invalid input! Please enter a valid positive integer for the ID.");
             }
         }
         boolean bookAvailability=false;
         while(true){
             System.out.println("is the book available");
             String availabilityInput=sc.nextLine();
             if(availabilityInput.equalsIgnoreCase("true")|| availabilityInput.equalsIgnoreCase("false")){
                 bookAvailability=Boolean.parseBoolean(availabilityInput);
                 break;
             }else{
                 System.out.println("Invalid input! Please enter 'true' or 'false' for availability.");
             }
         }
         String author="";
         while (author.trim().isEmpty()){
             System.out.println("enter the book author");
             author=sc.nextLine();
             if(author.trim().isEmpty()){
                 System.out.println("the author cannot be empty");
             }
         }
         Book book=new Book(bookTitle,bookItemId,bookAvailability);
         String dvdTitle="";
         while (dvdTitle.trim().isEmpty()){
             System.out.println("enter title for dvd");
             dvdTitle=sc.nextLine();
             if(dvdTitle.trim().isEmpty()){
                 System.out.println("dvd title cannot be empty");
             }
         }
         int dvdItemId=-1;
         while(dvdItemId<=0){
             System.out.println("enter id tof dvd");
             try {
                 dvdItemId=Integer.parseInt(sc.nextLine());
                 if(dvdItemId<=0){
                     System.out.println("dvd id cannot be empty. try again");
                 }
             }catch (NumberFormatException e){
                 System.out.println("invalid input please enter a valaid positive ID");
             }
         }
         boolean dvdAvailability=false;
         while (true){
             System.out.println("is the dvd ");
             String availableInput=sc.nextLine();
             if(availableInput.equalsIgnoreCase("true")|| availableInput.equalsIgnoreCase("false")){
                 dvdAvailability=Boolean.parseBoolean(availableInput);
                 break;

             }else {
                 System.out.println("invalid input,try again");
             }
         }
         int duration=-1;
         while(duration<=0){
             System.out.println("enter dvd duration");
             try {
                 duration=Integer.parseInt(sc.nextLine());
                 if(duration<=0){
                     System.out.println("duration must be above 0");
                 }
             }catch (NumberFormatException e){
                 System.out.println("invalid input! ");
             }
         }
         DVD dvd=new DVD(dvdTitle,dvdItemId,dvdAvailability,duration);
         System.out.println("--------------book details----------");
         book.displayDetails();
         System.out.println("--- DVD Details ---");
         dvd.displayDetails();
     } catch (Exception e) {
         System.out.println("error "+e.getMessage());
     }finally {
         sc.close();
     }


    }
}