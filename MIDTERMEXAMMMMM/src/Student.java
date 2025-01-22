import java.util.Scanner;

public class Student {
    String name;
    double mathMark;
    double scienceMark;
    double englishScore;
    double historyScore;
    double artScore;



    public double totalMarks(){
        double total=mathMark+scienceMark+englishScore+historyScore+artScore;
        return total;
    }
    public double averageScore(){
        double average=totalMarks()/5;

        return average;

    }
    public void categoryOfPerformance(){
        if(averageScore()>=85){
            System.out.println(" the grade is excellent");
        } else if (averageScore()>=70 && averageScore()<=84) {
            System.out.println(" the grade is good");
        } else if (averageScore()>=50 && averageScore()<=69) {
            System.out.println("your grades needs improvement");
        }else{
            System.out.println(" the grade is fail");
        }

    }

    public void displayStudentInfo(){
        System.out.println("student name is "+ name);
        System.out.println("the average score is "+averageScore());

    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("how many students you want to enter grades");
        int numberOfStudent=sc.nextInt();
        System.out.println("enter 5 subjects for the first student");
        System.out.println("enter the student 1  name");
        s1.name=sc.nextLine();
        sc.nextLine();

        System.out.println("enter math score for student 1");
        s1.mathMark=sc.nextDouble();
        System.out.println("enter science score for student 1");
        s1.scienceMark=sc.nextDouble();
        System.out.println("enter english score for student 1");
        s1.englishScore=sc.nextDouble();
        System.out.println("enter history score for student 1");
        s1.historyScore=sc.nextDouble();
        System.out.println("enter art score for student 1");
        s1.artScore=sc.nextDouble();


        System.out.println("enter the student 2 name");
        s2.name=sc.nextLine();
        sc.nextLine();
        System.out.println("enter math score for student 2");
        s2.mathMark=sc.nextDouble();
        System.out.println("enter science score for student 2");
        s2.scienceMark=sc.nextDouble();
        System.out.println("enter english score for student 2");
        s2.englishScore=sc.nextDouble();
        System.out.println("enter history score for student 2");
        s2.historyScore=sc.nextDouble();
        System.out.println("enter art score for student 2");
        s2.artScore=sc.nextDouble();

        s1.totalMarks();
        s1.averageScore();
        s1.categoryOfPerformance();
        s1.displayStudentInfo();
        sc.nextLine();


        s2.totalMarks();
        s2.averageScore();
        s2.categoryOfPerformance();
        s2.displayStudentInfo();











    }
}
