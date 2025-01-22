package TRAFFIC_FINES;

public class Driver extends Person{
    private double totalFines;
    private int violationCount;
    public Driver(String name, String licenseNumber) throws InvalidLicenseNumberException {
        super(name, licenseNumber);
        if(!licenseNumber.matches("[a-zA-Z0-9]{8,12}")){

        }



    }

    public Driver(String name, String licenseNumber, double totalFines, int violationCount) throws InvalidLicenseNumberException {
        super(name, licenseNumber);
        if(!licenseNumber.matches("[a-zA-Z0-9]{8,12}")){

        }

        this.totalFines = 0.0;
        this.violationCount = 0;
    }

    public void addViolation(double fineAmount)throws InvalidFineAmountException{
      if(fineAmount<0){
          throw new InvalidFineAmountException("fine amount must be greater than 0");

      }
     this. totalFines+=fineAmount;
      this.violationCount++;
    }
    public void resetViolation(){
        this.violationCount=0;
        this.totalFines=0;
    }

    @Override
    public void displayDetails() {
        System.out.println("driver details");
        System.out.println("the drivers name is "+getName());
        System.out.println("the license is "+getLicenseNumber());
        System.out.println("total fine to pay is " + totalFines);
        System.out.println("Number of Violations: " + violationCount);

    }
}
