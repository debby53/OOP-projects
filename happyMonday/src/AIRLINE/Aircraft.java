package AIRLINE;

public class Aircraft {
private String modelNumber;
private double capacity;
private double fuelConsumption;

    public Aircraft(String modelNumber, double capacity, double fuelConsumption) {
        this.modelNumber = modelNumber;
        this.capacity = capacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double calculateRange(){
        return capacity*100/fuelConsumption;


}
}
