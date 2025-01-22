package MANAGING_TRAFFIC;

import java.util.HashSet;
import java.util.Set;

public class SpecificViolation extends TrafficViolation{
    private String violationType;
    private double fineAmount;
    private static final Set<String>VALID_TYPES=new HashSet<>();
    static {
        VALID_TYPES.add("speeding");
        VALID_TYPES.add("parking");
        VALID_TYPES.add("signal violation");

    }

    public SpecificViolation(String violationType, double fineAmount) throws InvalidViolationTypeException,InvalidFineAmountException{
        if(!VALID_TYPES.contains(violationType)){
            throw new InvalidViolationTypeException("violation must be btn speeding,parking,signal violation");
        }
        if(fineAmount<0){
          throw new InvalidFineAmountException("fine amount must be greater than 0");
        }
        this.violationType = violationType;
        this.fineAmount = fineAmount;
    }

    @Override
    public void validateViolation()throws InvalidFineAmountException,InvalidViolationTypeException {
        if(fineAmount<0){
            throw new InvalidViolationTypeException("fine amount is no negative");

        }
        if (!VALID_TYPES.contains(violationType)){
            throw new InvalidViolationTypeException("choose btn 3");
        }

    }
    public String getViolationDetails(){
        return violationType + ""+fineAmount;
    }
}
