package MANAGING_TRAFFIC;
class InvalidLicenseNumberExeption extends Exception {
    public InvalidLicenseNumberExeption(String message) {
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

public  abstract class Person {
    private String name;
    private String license;

    public Person(String name, String license) throws InvalidLicenseNumberExeption {
        if(!license.matches("[a-zA-Z0-9]{8,12}")) {
            throw new InvalidLicenseNumberExeption("Invalid license number: must be 8-12 alphanumeric characters");
        }
        this.name = name;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
    public  abstract  void displayDetails();




}
