package QUIZZZZ2222;

public  abstract class TicketBooking {
    String name;
    String location;
    String destination;
    int age;
    String gender;
    public  abstract void bookTicket();
    public void  getDetails(){
        System.out.println("booking details");
        System.out.println("----------------");
        System.out.println("the name of customer is "+name);
        System.out.println("the location is "+location);
        System.out.println("the destination is "+destination);


    }



}
