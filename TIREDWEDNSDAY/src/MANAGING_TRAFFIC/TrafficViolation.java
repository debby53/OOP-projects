package MANAGING_TRAFFIC;

public  abstract class TrafficViolation {
    public abstract void  validateViolation()throws InvalidFineAmountException,InvalidViolationTypeException;
}
