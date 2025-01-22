package AIRLINE;

public class EmergencyRepair extends MaintenanceLog{
    public EmergencyRepair(int logID, int aircraftID, String dateOfMaintenance) {
        super(logID, aircraftID, dateOfMaintenance);
    }

    @Override
    public void logDetails() {
        super.logDetails();
    }
}
