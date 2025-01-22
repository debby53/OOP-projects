package AIRLINE;

public class DomesticFlight extends Flight{
    public DomesticFlight(String flightNumber, String departureTime, String destination) {
        super(flightNumber, departureTime, destination);
    }

    @Override
    public double calculateDuration() {
        return super.calculateDuration()+2;
    }
}
