package AIRLINE;

import javax.xml.parsers.SAXParser;

public class Flight {
    private String flightNumber;
    private String departureTime;
    private String destination;

    public Flight(String flightNumber, String departureTime, String destination) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double  calculateDuration(){
        return 3.0;
    }
}
