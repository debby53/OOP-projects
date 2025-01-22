package STUDENT_ATTENDENCE;

import java.util.HashMap;
import java.util.Map;
class InvalidStudentIdException extends Exception{
    public InvalidStudentIdException(String message){
        super(message);
    }
}



public class AttendanceSystem implements IAttendanceManager{
    Map<Integer, Student>studentMap;
    public AttendanceSystem(){
       this. studentMap=new HashMap<>();
    }
    public void addStudent(Student student){
        student=studentMap.put(student.getId(), student);

    }
    @Override
    public void markAttendance(int studentId, Boolean isPresent) throws InvalidStudentIdException {
        Student student=studentMap.get(studentId);
        if(student==null){
            throw new InvalidStudentIdException("the student with id "+studentId + "does not exist");
        }try {
            student.updateAttendance(isPresent?1:0,1);
        } catch (InvalidAttendanceException e) {
            System.out.println("error "+e.getMessage());
        }



    }

    @Override
    public void getAttendance(int studentId)throws InvalidStudentIdException {
        Student student=studentMap.get(studentId);
        if(student==null){
            throw new InvalidStudentIdException("student "+studentId + "not exists");
        }
        student.getAttendancePercentage();

    }

    @Override
    public void generateAttendanceReport() {
        for(Student student: studentMap.values()){
            System.out.println("student report");
            System.out.println("student name is "+student.getName());
            System.out.println("student id is "+student.getId());
            System.out.println("student email is "+student.getEmail());
            System.out.println("student percntange "+student.getAttendancePercentage());
        }

    }
}
