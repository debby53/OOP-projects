package PAYROLL_SYSYTEM;

public interface Payroll {
    void calculatePerment(double salary);
    void calculateCasual(double salary);
    void calculateContactual(double salary);
    void displayEmpDetails();
}
