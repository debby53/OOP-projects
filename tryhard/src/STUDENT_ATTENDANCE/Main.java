package STUDENT_ATTENDANCE;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AttendanceSystem system=new AttendanceSystem();
        for(int i=0; i<3; i++){
            System.out.println("enter student details for "+(i+1));
            String name="";
            String email;
            int id;
            double grade;
            String section;
            double attendance;

            while (true){
                System.out.println("enter student id");
                try {
                    id=Integer.parseInt(sc.nextLine());
                    if(String.valueOf(id).length()==6){
                        break;
                    }else {
                        System.out.println("try again id must be 6 ");
                    }
                }catch (NumberFormatException e){
                    System.out.println("error "+e.getMessage());
                }
            }
            while (true){
                System.out.println("enter student  email");

                    email=sc.nextLine();
                    String emailRegex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
                    if(Pattern.matches(emailRegex,email)){
                        break;
                    }else{
                        System.out.println("follow email format try gain ");
                    }


            }
            while (name.trim().isEmpty()){
                System.out.println("enter your name");
                name=sc.nextLine();
                if(name.trim().isEmpty()){
                    System.out.println("the name should not be empty please try again");

                }

            }
            System.out.println("entet your grades");
            grade=Double.parseDouble(sc.nextLine());
            System.out.println("enter your section");
            section=sc.nextLine();

             Student student=new Student(name,email,id,grade,section);
             system.addStudent(student);

             for(int j=0; j<5; j++){
                 System.out.println("Mark Attendance for Day "+(j+1));
                 while (true) {
                     try {


                         System.out.println("enter student id ");
                         int studentId = Integer.parseInt(sc.nextLine());
                         System.out.println("is present(true /false) ");
                         Boolean isPresent = Boolean.parseBoolean(sc.nextLine());
                         system.markAttendance(id, isPresent);
                         break;
                     }catch (InvalidStudentIdException e){
                         System.out.println(e.getMessage());
                     }catch (Exception e){
                         System.out.println("try again");
                     }
                 }

             }
             system.generateAttendanceReport();



        }
    }
}
