package TRAFFIC_FINES;

import java.util.HashSet;
import java.util.Set;

public class SpecificViolation extends TrafficViolation {
    private String violationType;
    private double fineAmount;
    private static final Set<String>VALID_TYPE=new HashSet<>();
    static {
        VALID_TYPE.add("parking");
        VALID_TYPE.add("speeding");
        VALID_TYPE.add("Signal Violation");
    }


    public SpecificViolation(String violationType, double fineAmount) throws InvalidFineAmountException,InvalidViolationTypeException{
        if(fineAmount<0){
            throw new InvalidFineAmountException("fine amount must be greater than 0");
        }
        if(!VALID_TYPE.contains(violationType)){
            throw new InvalidViolationTypeException("violation type is speeding,parking and signal viloation");
        }

        this.violationType = violationType;
        this.fineAmount = fineAmount;
    }

    @Override
    public void validateViolation() throws InvalidFineAmountException, InvalidViolationTypeException {
        if(fineAmount<0) {
            throw new InvalidFineAmountException("fine amount is non negative");
        }

        if (!VALID_TYPE.contains(violationType)){
            throw new InvalidViolationTypeException("choose only 3");
        }


    }
    public String getViolationDetails(){
        return violationType + " " + fineAmount;
    }
}
