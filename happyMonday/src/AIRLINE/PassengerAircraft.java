package AIRLINE;

public class PassengerAircraft extends Aircraft{
    public PassengerAircraft(String modelNumber, double capacity, double fuelConsumption) {
        super(modelNumber, capacity, fuelConsumption);
    }

    @Override
    public double calculateRange() {
       return super.calculateRange()-500;
    }
}
