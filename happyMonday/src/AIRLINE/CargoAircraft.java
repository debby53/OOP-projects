package AIRLINE;

public class CargoAircraft extends Aircraft{
    public CargoAircraft(String modelNumber, double capacity, double fuelConsumption) {
        super(modelNumber, capacity, fuelConsumption);
    }

    @Override
    public double calculateRange() {
        return super.calculateRange()-300;
    }
}
