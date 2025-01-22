package SMART_HOME_SYSTEM;

public  abstract class SmartDevice implements Controllable {
    private String deviceName;
    private boolean status;
    private double energyConsumption;

    public SmartDevice(String deviceName,  double energyConsumption) {
        this.deviceName = deviceName;

        this.energyConsumption = energyConsumption;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public abstract void displayDeviceDetails();
}
