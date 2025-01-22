package AIR_TICKET_BOOKING;

public class BusinessClassBooking extends  TicketBooking implements  Discountable{

    public BusinessClassBooking(String name, String location, String destination, String ticketType, String gender, int age,double price) {
        super(name, location, destination, ticketType, gender, age,price);
    }

    @Override
    public void bookTicket() {
        System.out.println("booking confirmed for business class to "+getDestination());
    }

    @Override
    public void applyDiscount() {
        if(getGender().equalsIgnoreCase("female")&& getAge()>40){
            setPrice(getPrice()*0.80);
        }
    }
}
