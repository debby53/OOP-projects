package QUIZZZZ2222;

public class BusinessClassBooking extends TicketBooking implements Discountable {

    @Override
    public void bookTicket() {
        if(location.equalsIgnoreCase("Musanze")|| location.equalsIgnoreCase("Rusizi") && destination.equalsIgnoreCase("Doha")|| destination.equalsIgnoreCase("r Johannesburg")){
            System.out.println("Booking confirmed for  Business Class to " + destination);
        }else{
            System.out.println("not allowed for business class booking");
        }
    }

    @Override
    public double applyDiscount(double price) {
        if(gender.equalsIgnoreCase("female") && age>40){
            System.out.println("elligible for discount ");
            System.out.println(price=price*0.2);
        }else{
            System.out.println("not eligible for discount");
        }
        return price;
    }
}
