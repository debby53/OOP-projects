package AIRLINE;

public class GroundStaff extends AirlineEmployee{
    public GroundStaff(int employeeID, String name, double baseSalary) {
        super(employeeID, name, baseSalary);
    }

    public void assistPassengers() {
        System.out.println("Ground Staff assisting passengers.");
    }
}
