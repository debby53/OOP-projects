package TRAFFIC_FINES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidLicenseNumberException, InvalidFineAmountException, InvalidViolationTypeException {
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.println("driver enter driver details");
            String name;
            String lisence;
            System.out.println("enter drivers name");
            name=sc.nextLine();
            while (true){
                System.out.println("enter drivers license number");
                lisence=sc.nextLine();
                try {
                    if(!lisence.matches("[a-zA-Z0-9]{8,12}")){
                        throw new InvalidLicenseNumberException("plz try agin");

                    }
                    break;
                }catch (InvalidLicenseNumberException e){
                    System.out.println("error "+e.getMessage());
                }
            }
            Driver driver=new Driver(name,lisence);
            while (true){
                System.out.println("enter violation type");
                String violationType=sc.nextLine();
                double fineAmount;
                while (true){
                    System.out.println("enter fine amount");
                    try {
                        fineAmount=Double.parseDouble(sc.nextLine());
                        if(fineAmount<0){
                            throw new InvalidFineAmountException("fine amount must be greater than 0");
                        }
                        break;
                    }catch (NumberFormatException|InvalidFineAmountException e){
                        System.out.println("error "+ e.getMessage());
                    }

                }
                try {


                    SpecificViolation violation = new SpecificViolation(violationType, fineAmount);
                    violation.validateViolation();
                    driver.addViolation(fineAmount);
                    System.out.println("violation added successfully");
                }catch (InvalidFineAmountException | InvalidViolationTypeException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("do you want to add onother violation (yes/no");
                String choice=sc.nextLine();
                if(!choice.equalsIgnoreCase("yes")){
                    break;
                }

            }
            driver.displayDetails();
            System.out.println("do you want ot reset driverrs info");
            String resetChoice=sc.nextLine();
            if(resetChoice.equalsIgnoreCase("yes")){
                driver.resetViolation();
                System.out.println("reset successfully");
                driver.displayDetails();
            }


        }
    }
}
