package Midterm;

public class Pl {
    private String  studentName;
    private double quizMarks;
    private double midTermMarks;
    private double finalExamMarks;
    private  int ID;

    public Pl(String studentName, double quizMarks, double midTermMarks, double finalExamMarks, int ID) {
        this.studentName = studentName;
        this.quizMarks = quizMarks;
        this.midTermMarks = midTermMarks;
        this.finalExamMarks = finalExamMarks;
        this.ID = ID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getQuizMarks() {
        return quizMarks;
    }

    public void setQuizMarks(double quizMarks) {
        if(quizMarks>=0 && quizMarks<=100) {
            this.quizMarks = quizMarks;
        }else{
            System.out.println("invalid quiz marks , the range is (0-100)");
            this.quizMarks=0;
        }
    }

    public double getMidTermMarks() {
        return midTermMarks;
    }

    public void setMidTermMarks(double midTermMarks) {
        if(midTermMarks>=0 && midTermMarks<=100) {
            this.midTermMarks = midTermMarks;
        }else{
            System.out.println("invalid mid marks , the range is (0-100)");
            this.midTermMarks=0;
        }
    }

    public double getFinalExamMarks() {
        return finalExamMarks;
    }

    public void setFinalExamMarks(double finalExamMarks) {
        if(finalExamMarks>=0 && finalExamMarks<=100) {
            this.finalExamMarks = finalExamMarks;
        }else{
            System.out.println("invalid  final marks , the range is (0-100)");
            this.finalExamMarks=0;
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public double calculateAverageMarks(){
        return (finalExamMarks+midTermMarks+quizMarks)/5;
    }
    public double calculateTotalMarks(){
        return (finalExamMarks+midTermMarks+quizMarks);
    }
    public void displayStudentInfo(){
        System.out.println("student name is "+studentName);
        System.out.println("student id is "+ID);
        if(quizMarks>0){
            System.out.println("the quiz marks are "+quizMarks);
        }else{
            System.out.println("quiz not attempted");
        }
        if(midTermMarks>0 && finalExamMarks>0){
            System.out.println("midterm marks "+midTermMarks);
            System.out.println("final marks "+finalExamMarks);
            System.out.println("the total marks "+calculateTotalMarks());
            System.out.println("the average marks "+calculateAverageMarks());
        }
        else{
            System.out.println("midterm or final exam not attempted");
        }
    }

    public static void main(String[] args) {
        Pl p1=new Pl("keza",19,18,17,26788);
        p1.displayStudentInfo();

    }
}
