package QUIZZZZ2222;

public class EconomicClassBooking extends TicketBooking implements Discountable{

    @Override
    public void bookTicket() {


        System.out.println("Booking confirmed for Economic Class to "+destination);

    }

    @Override
    public double applyDiscount(double price) {

        if(gender.equalsIgnoreCase("female") && age>40){
            System.out.println("elligible for discount ");
            price=price*0.2;
        }else{
            System.out.println("not eligible for discount");
        }
        return price;
    }
    }

