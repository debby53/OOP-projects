package STUDENT_ATTENDANCE;

public interface IAttendanceManager {
   void markAttendance(int studentId, Boolean isPresent);
   void getAttendance(int studentId);
   void  generateAttendanceReport();

}
