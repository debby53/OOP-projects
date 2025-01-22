package TRAFFIC_FINES;

class InvalidLicenseNumberException extends Exception{
    public InvalidLicenseNumberException(String message){
        super(message);
    }
}
class InvalidFineAmountException extends Exception{
    public InvalidFineAmountException(String message){
        super(message);
    }
}
class InvalidViolationTypeException extends Exception{
    public InvalidViolationTypeException(String message){
        super(message);
    }
}

public abstract class Person {
    private String name;
    private String licenseNumber;

    public Person(String name, String licenseNumber) throws InvalidLicenseNumberException {
        if(!licenseNumber.matches("[a-zA-Z0-9]{8,12}")){
            throw  new InvalidLicenseNumberException("license should be 8-18 characters");
        }
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public abstract void displayDetails();
}
