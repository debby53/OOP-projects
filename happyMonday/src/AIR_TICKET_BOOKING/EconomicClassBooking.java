package AIR_TICKET_BOOKING;

public class EconomicClassBooking extends TicketBooking implements Discountable {
    public EconomicClassBooking(String name, String location, String destination, String ticketType, String gender, int age,double price) {
        super(name, location, destination, ticketType, gender, age,price);
    }

    @Override
    public void bookTicket() {
        System.out.println("booking confrimed for economic class " + getDestination());

    }

    @Override
    public void applyDiscount() {
        if (getGender().equalsIgnoreCase("female") && getAge() > 40) {
           setPrice(getPrice()*0.80);
        }
    }
}