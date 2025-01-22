package QUIZZZ;

public class EconomicClassBooking extends  TicketBooking implements Discountable{
    public EconomicClassBooking(String name, String location, String destination, String ticketType, String gender, int age) {
        super(name, location, destination, ticketType, gender, age);
    }

    @Override
    public void bookTicket() {
        System.out.println("Booking confirmed for  Economic Class to "+ getDestination());
    }

    @Override
    public void applyDiscount(double price) {
        if(getGender().equalsIgnoreCase("female")&& getAge()>40){
            double totalPrice=price*0.20;
            System.out.println("the total price after discount is "+totalPrice);
        }else{
            System.out.println("not eligible for discount");
        }
    }
}
