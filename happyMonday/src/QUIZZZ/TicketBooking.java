package QUIZZZ;

public  abstract class TicketBooking {
    private String name;
    private String location;
    private String destination;
    private String ticketType;
    private String gender;
    private int age;

    public TicketBooking(String name, String location, String destination, String ticketType, String gender, int age) {
        this.name = name;
        this.location = location;
        this.destination = destination;
        this.ticketType = ticketType;
        this.gender = gender;
        this.age = age;
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
        if(destination.equalsIgnoreCase("Doha")|| destination.equalsIgnoreCase("Johannesburg")) {
            this.destination = destination;
        }else{
            System.out.println("no ohter destinations");
        }
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
        if(gender.equalsIgnoreCase("female")|| gender.equalsIgnoreCase("male")) {
            this.gender = gender;
        }else{
            System.out.println("we dont allow elgbtq");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0) {
            this.age = age;
        }else{
            System.out.println("age should be above 0");
        }
    }

    public  abstract void  bookTicket();
    public void getDetails(){
        System.out.println("the customer name is "+ name);
        System.out.println("the location is "+location);
        System.out.println("the destination is "+destination);
    }
}
