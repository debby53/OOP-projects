package AIRLINE;

public class UpgradeMaintenance extends MaintenanceLog{
    public UpgradeMaintenance(int logID, int aircraftID, String dateOfMaintenance) {
        super(logID, aircraftID, dateOfMaintenance);
    }

    @Override
    public void logDetails() {
        super.logDetails();
    }
}
