package TRAFFIC_FINES;

public abstract class TrafficViolation {
    public abstract void validateViolation() throws InvalidFineAmountException, InvalidViolationTypeException;

}
