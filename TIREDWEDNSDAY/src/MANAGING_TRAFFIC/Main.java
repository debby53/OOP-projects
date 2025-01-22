package MANAGING_TRAFFIC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidLicenseNumberExeption, InvalidFineAmountException {
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<2; i++){
            System.out.println("enter details for driver "+(i+1));
            String name;
            String license;
            while (true){
                System.out.println("enter license number");
                try {
                    license=sc.nextLine();
                    if(!license.matches("[a-zA-Z0-9]{8,12}")){
                        throw  new InvalidLicenseNumberExeption("plz try again");
                    }
                    break;

                }catch (InvalidLicenseNumberExeption e){
                    System.out.println("error "+e.getMessage());

                }
            }
            System.out.println("enter your name");
            name=sc.nextLine();
            Driver driver=new Driver(name,license);

            while (true){
                System.out.println("enter violation type");
                String violationType=sc.nextLine();
                double fineAmount;
                while (true){
                    System.out.println("entet fine amount");
                    try {
                        fineAmount=Double.parseDouble(sc.nextLine());
                        if(fineAmount<=0){
                            throw new InvalidFineAmountException("try gain");
                        }
                        break;
                    }catch (NumberFormatException | InvalidFineAmountException e){
                        System.out.println("invalid fine mount");
                    }
                }
                try {
                    SpecificViolation violation=new SpecificViolation(violationType,fineAmount);
                    violation.validateViolation();
                    driver.addViolation(fineAmount);
                    System.out.println("violation added succesffully");

                }catch (InvalidViolationTypeException | InvalidFineAmountException e) {
                    System.out.println("error "+e.getMessage());
                }
                System.out.println("dou you want to add onother vilation(yes/no)");
                String choice=sc.nextLine();
                if(!choice.equalsIgnoreCase("yes")){
                    break;
                }

            }
            System.out.println("driver info");
            driver.displayDetails();
            System.out.println("do you want to reset violations for this driver (yes?no");
            String resetChoice=sc.nextLine();
            if(resetChoice.equalsIgnoreCase("yes")){
                driver.resetViolations();
                System.out.println("vilations reset successfully");
                driver.displayDetails();
            }
        }
    }
}
