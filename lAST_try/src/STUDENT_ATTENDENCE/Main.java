package STUDENT_ATTENDENCE;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AttendanceSystem system=new AttendanceSystem();
        for(int i=0; i<3; i++){
            System.out.println("enter details for " +(i+1));
            String name;
            String email;
            String section;
            int id;
            double grade;
            while (true){
                System.out.println("enter id for student i ");
                try {
                    id=Integer.parseInt(sc.nextLine());
                    if(String.valueOf(id).length()==6){
                     break;
                    }else {
                        System.out.println("try again");
                    }
                }catch (NumberFormatException e){
                    System.out.println("error "+e.getMessage());
                }
            }
            while (true){
                System.out.println("enter student email");
                email=sc.nextLine();
                String emailRegex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
                if(Pattern.matches(emailRegex,email)){
                    break;
                }else{
                    System.out.println("plz try again");
                }
            }
            System.out.println("enter the name");
            name=sc.nextLine();
            System.out.println("enter grade");
            grade=Double.parseDouble(sc.nextLine());
            System.out.println("enter section");
            section=sc.nextLine();
            Student student=new Student(name,email,id,grade,section);
            system.addStudent(student);

            while (true){
              for(int j=0; j<5; j++){

              }
            }

        }
    }
}
