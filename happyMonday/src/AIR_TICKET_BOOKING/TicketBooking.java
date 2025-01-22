package AIR_TICKET_BOOKING;

public abstract class TicketBooking {
    private String name;
    private String location;
    private String destination;
    private String ticketType;
    private String gender;
    private int age;
    private double price;

    public TicketBooking(String name, String location, String destination, String ticketType, String gender, int age,double price) {
        this.name = name;
        this.location = location;
        this.destination = destination;
        this.ticketType = ticketType;
        this.gender = gender;
        this.age = age;
        this.price=price;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {

        this.destination = destination;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void bookTicket();
    public void getDetails(){
        System.out.println("the customer name is "+ name);
        System.out.println("the location is "+location);
        System.out.println("the destination is "+destination);
        System.out.println("the ticket type is "+ ticketType);
    }

}
