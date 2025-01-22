package STUDENT_ATTE;
class InvalidAttendanceException extends Exception{
    public InvalidAttendanceException(String message){
        super(message);
    }
}

public class Student extends Person{
    private double grade;
    private String section;
    private double attendancePercentage;
    private int daysPresent;
    private int  totalDays;

    public Student(String name, String email, int id, int totalDays, int daysPresent, double attendancePercentage) {
        super(name, email, id);
        this.totalDays = totalDays=0;
        this.daysPresent = daysPresent=0;
        this.attendancePercentage = attendancePercentage=0;
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
    public void  updateAttendance(int daysPresent,int  totalDays) throws InvalidAttendanceException{
        if(daysPresent<0 || daysPresent<0 || daysPresent>totalDays){
            throw new InvalidAttendanceException("days present<total days and both not negative ");
        }
        this.daysPresent+=daysPresent;
        this.totalDays+=totalDays;
        this.attendancePercentage=(daysPresent/totalDays)*100;

    }
}
