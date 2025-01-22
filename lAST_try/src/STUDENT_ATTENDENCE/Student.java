package STUDENT_ATTENDENCE;
class InvalidAttendanceException extends Exception{
    public InvalidAttendanceException(String message){
        super(message);
    }
}

public class Student extends Person{
    private double grade;
    private String section;
    private double attendancePercentage;
    private int totalDays;
    private int daysPresent;

    public Student(String name, String email, int id, int daysPresent, int totalDays, double attendancePercentage) {
        super(name, email, id);
        this.daysPresent = 0;
        this.totalDays = 0;
        this.attendancePercentage = 0.0;
    }

    public Student(String name, String email, int id, double grade, String section) {
        super(name, email, id);
        this.grade = grade;
        this.section = section;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(double attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public int getDaysPresent() {
        return daysPresent;
    }

    public void setDaysPresent(int daysPresent) {
        this.daysPresent = daysPresent;
    }
    public  void updateAttendance(int daysPresent, int totalDays)throws InvalidAttendanceException{
        if(daysPresent<0 || totalDays<0 || daysPresent>totalDays){
            throw new InvalidAttendanceException("days present and total days must be not negative and days present<=total days");
        }
        this.daysPresent+=daysPresent;
        this.totalDays+=totalDays;
        this.attendancePercentage=(daysPresent/totalDays)*100;
    }

}
