package SMART_HOME_SYSTEM;

public class Camera extends SmartDevice{
    public Camera(String deviceName,  double energyConsumption) {
        super(deviceName,  energyConsumption);
    }

    @Override
    public void turnOn() {
        if(!getStatus()){
           setStatus(true);
            System.out.println(getDeviceName() + "is now on");
        }else{
            System.out.println(getDeviceName() + "is already on");
        }

    }

    @Override
    public void turnOff() {
        if(getStatus()){
            setStatus(false);
            System.out.println(getDeviceName() + "is now off");
        }else{
            System.out.println( getDeviceName() + "is arleady off ");
        }

    }

    @Override
    public void displayDeviceDetails() {
        System.out.println("---------camera info=======");
        System.out.println("the device neme is "+getDeviceName());
        System.out.println("the status is "+getStatus());
        System.out.println("the energy consuption is "+getEnergyConsumption());

    }
}
