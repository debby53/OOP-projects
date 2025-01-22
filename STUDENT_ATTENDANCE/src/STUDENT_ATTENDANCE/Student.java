package STUDENT_ATTENDANCE;

public class Student extends  Person{
    private double grade;
    private  int section;
    private double attendancePercentage;

    public Student(String name, int id, String email, double grade, int section, double attendancePercentage) {
        super(name, id, email);
        this.grade = grade;
        this.section = section;
        this.attendancePercentage = attendancePercentage;
    }

    public void updateAttendance(int daysPresent, int totalDays){

    }



}
