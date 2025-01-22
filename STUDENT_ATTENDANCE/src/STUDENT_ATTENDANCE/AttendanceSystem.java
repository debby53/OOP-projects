package STUDENT_ATTENDANCE;

import java.util.HashMap;
import java.util.Map;
class InvalidAttendanceException extends Exception{
    public InvalidAttendanceException(String message){
        super(message);
    }
}
class InvalidStudentException extends Exception{
    public InvalidStudentException(String message){
        super(message);
    }
}

public class AttendanceSystem implements IAttendanceManager{
    private Map<Integer,Student> studentMap;
    public AttendanceSystem(){
        this.studentMap=new HashMap<>();
    }
    public void addStudent(Student student){
        studentMap.put(student.getId(),student);
    }
    @Override
    public void markAttendance(int studentId, Boolean isPresent) throws InvalidStudentException {
        Student student=studentMap.get(studentId);
        if(student==null){
            throw new InvalidStudentException("student id "+studentId + "does not exist");
        }
        try{
            student.updateAttendance(isPresent?1:0,1);
        }catch ( InvalidAttendanceException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void getAttendance(int studentId) {

    }

    @Override
    public void generateAttendanceReport() {

    }
}
