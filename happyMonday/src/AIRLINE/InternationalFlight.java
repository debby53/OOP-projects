package AIRLINE;

public class InternationalFlight extends Flight{
    private boolean customsCheck;
    private boolean visaRequirements;

    public InternationalFlight(String flightNumber, String departureTime, String destination, boolean customsCheck, boolean visaRequirements) {
        super(flightNumber, departureTime, destination);
        this.customsCheck = customsCheck;
        this.visaRequirements = visaRequirements;
    }

    @Override
    public double calculateDuration() {
        return super.calculateDuration()-1;
    }

    public boolean isCustomsCheck() {
        return customsCheck;
    }

    public void setCustomsCheck(boolean customsCheck) {
        this.customsCheck = customsCheck;
    }

    public boolean isVisaRequirements() {
        return visaRequirements;
    }

    public void setVisaRequirements(boolean visaRequirements) {
        this.visaRequirements = visaRequirements;
    }
}
