package AIRLINE;

public class FirstClassTicket extends Ticket{
    public FirstClassTicket(int ticketId, double price, int seatNumber) {
        super(ticketId, price, seatNumber);
    }

    @Override
    public void calculateFinalPrice() {
        super.calculateFinalPrice();
    }
}
