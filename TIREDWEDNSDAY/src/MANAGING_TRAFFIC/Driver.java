package MANAGING_TRAFFIC;

public class Driver extends Person{
    private double totalFines;
   private int violationCount;

    public Driver(String name, String license) throws InvalidLicenseNumberExeption {
        super(name, license);
        if(!license.matches("[a-zA-Z0-9]{8,12}")){

        }

    }



    public Driver(String name, String license, int violationCount, double totalFines) throws InvalidLicenseNumberExeption {
        super(name, license);
        if(!license.matches("[a-zA-Z0-9]{8,12}")){

        }

        this.violationCount = 0;
        this.totalFines = 0.0;
    }
    public void addViolation(double fineAmount) throws InvalidFineAmountException{
        if(fineAmount<=0) {
            throw new InvalidFineAmountException("fine amount should be above 0");
        }
        this.totalFines+=fineAmount;
        this.violationCount++;



    }
    public void resetViolations(){
        this.totalFines=0.0;
        this.totalFines=0;

    }
    @Override
    public void displayDetails() {
        System.out.println("driver details-------------");
        System.out.println("the drivers name is "+getName());
        System.out.println("the license is "+getLicense());
        System.out.println("total fine to pay is " + totalFines);
        System.out.println("Number of Violations: " + violationCount);
        System.out.println("----------------------------------");
    }


}
