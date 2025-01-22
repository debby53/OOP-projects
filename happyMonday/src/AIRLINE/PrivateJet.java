package AIRLINE;

public class PrivateJet extends Aircraft{
    public PrivateJet(String modelNumber, double capacity, double fuelConsumption) {
        super(modelNumber, capacity, fuelConsumption);
    }

    @Override
    public double calculateRange() {
       return super.calculateRange()+200;
    }
}
