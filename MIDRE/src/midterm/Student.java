package midterm;

import java.util.Scanner;

public class Student {
    private String name;
    private int quizMarks;
    private int midTermMarks;
    private int finalExamMarks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuizMarks() {
        return quizMarks;
    }

    public void setQuizMarks(int quizMarks) {
        if(quizMarks>=0 && quizMarks<=100) {
            this.quizMarks = quizMarks;
        }else{
            System.out.println("invalid marks the range is (0-100)");
        }
    }

    public int getMidTermMarks() {
        return midTermMarks;
    }

    public void setMidTermMarks(int midTermMarks) {
        if(midTermMarks>=0 && midTermMarks<=100) {
            this.midTermMarks = midTermMarks;
        }else{
            System.out.println("invalid marks the range is (0-100)");
        }
    }

    public int getFinalExamMarks() {
        return finalExamMarks;
    }

    public void setFinalExamMarks(int finalExamMarks) {
        if(finalExamMarks>=0 && finalExamMarks<=100) {
            this.finalExamMarks = finalExamMarks;
        }else{
            System.out.println("invalid marks the range is (0-100)");
        }
    }
    public double getTotalMarks(){
        if(midTermMarks==0 || finalExamMarks==0){
            System.out.println("invalid input");
            return -1;
        }else{
            return midTermMarks+finalExamMarks+quizMarks;
        }
    }
    public double getAverageMarks(){
        double totalMarks=getTotalMarks();
        if(totalMarks!=-1){
            return totalMarks/5.0;
        }else{
            return 0.0;
        }
    }
    public  boolean attemptedQuiz(){
        return quizMarks>0;
    }
    public void displayInfo(){
        if(attemptedQuiz()){
            System.out.println("student name "+name);
            System.out.println("Quiz Marks: " + quizMarks);
            System.out.println("Midterm Marks: " + midTermMarks);
            System.out.println("Final Exam Marks: " + finalExamMarks);

            int totalMarks=getQuizMarks();
            if(totalMarks!=-1){
                System.out.println("Total Marks: " + totalMarks);
                System.out.println("Average Marks out of 20: " + getAverageMarks());
            }
        }
        else{
            System.out.println("Student " + name + " did not attempt the quiz.");
        }

    }
    public static int validateMarks(Scanner sc, String examType){
        int marks=-1;
        while(marks<1 || marks>100){
            System.out.println("enter "+ examType + "marks(0-100)");
            marks=sc.nextInt();

            if(marks<1 || marks>100){
                System.out.println("invalid input marks");
            }
        }
        return marks;
    }

    public static void main(String[] args) {
        Student std=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student name");
        std.setName(sc.nextLine());
        int quiz=validateMarks(sc,"quiz");
        std.setQuizMarks(quiz);
        int mid=validateMarks(sc,"mid");
        std.setMidTermMarks(mid);
        int finalExam=validateMarks(sc, "final");
        std.setFinalExamMarks(finalExam);
        std.displayInfo();
        sc.close();

    }
}
