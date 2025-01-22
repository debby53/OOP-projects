package QUIZZZ;

public class BusinessClassBooking extends TicketBooking implements  Discountable{
    public BusinessClassBooking(String name, String location, String destination, String ticketType, String gender, int age) {
        super(name, location, destination, ticketType, gender, age);
    }

    @Override
    public void bookTicket() {
        System.out.println("Booking confirmed for Business Class to " + getDestination());

    }

    @Override
    public void applyDiscount(double price) {
        if(getGender().equalsIgnoreCase("female")&& getAge()>40){
            double discount=price*0.20;
            double totalPrice=price-discount;
            System.out.println("the total price after discount is "+totalPrice);
        }else{
            System.out.println("not eligible for discount");
        }
    }
}
