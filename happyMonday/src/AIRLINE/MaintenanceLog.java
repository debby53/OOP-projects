package AIRLINE;

public class MaintenanceLog {
    private int  logID;
    private int  aircraftID;
    private  String dateOfMaintenance;

    public MaintenanceLog(int logID, int aircraftID, String dateOfMaintenance) {
        this.logID = logID;
        this.aircraftID = aircraftID;
        this.dateOfMaintenance = dateOfMaintenance;
    }

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public int getAircraftID() {
        return aircraftID;
    }

    public void setAircraftID(int aircraftID) {
        this.aircraftID = aircraftID;
    }

    public String getDateOfMaintenance() {
        return dateOfMaintenance;
    }

    public void setDateOfMaintenance(String dateOfMaintenance) {
        this.dateOfMaintenance = dateOfMaintenance;
    }

    public void logDetails(){

    }
}
