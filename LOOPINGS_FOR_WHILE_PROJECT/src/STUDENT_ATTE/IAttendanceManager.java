package STUDENT_ATTE;

public interface IAttendanceManager {
    void  markAttendance(int studentId, Boolean isPresent) throws InvalidStudentIdException;
    void getAttendance(int studentId) throws InvalidStudentIdException;
    void generateAttendanceReport();
}
