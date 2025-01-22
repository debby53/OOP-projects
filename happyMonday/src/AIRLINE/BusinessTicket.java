package AIRLINE;

public class BusinessTicket extends Ticket{
    public BusinessTicket(int ticketId, double price, int seatNumber) {
        super(ticketId, price, seatNumber);
    }

    @Override
    public void calculateFinalPrice() {
        super.calculateFinalPrice();
    }
}
