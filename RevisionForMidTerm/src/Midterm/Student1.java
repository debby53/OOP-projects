package Midterm;

public class Student1 {
  private String  studentName;
  private double quizMarks;
  private double midTermMarks;
  private double finalExamMarks;
  private  int ID;

    public Student1(String studentName, double quizMarks, double midTermMarks, double finalExamMarks, int ID) {
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
            System.out.println("invalid quiz marks, it must be btn (0-100)");
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
            System.out.println("invalid midterm marks the range is (0-100)");
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
            System.out.println("invalid final marks the range is (0-100)");
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
        return (finalExamMarks+quizMarks+midTermMarks)/5;
    }
    public double  calculateTotalMarks(){
        return (finalExamMarks+midTermMarks+quizMarks);
    }
    public void displayStudentInfo(){
        System.out.println("the student name is "+studentName);
        System.out.println("the student id "+ ID);
        if(quizMarks>0){
            System.out.println("the quiz marks are "+quizMarks);
        }else{
            System.out.println("quiz not attempted ");
        }
        if(midTermMarks>0 && finalExamMarks>0){
            System.out.println("the midterm marks are "+midTermMarks);
            System.out.println("final marks "+finalExamMarks);
            System.out.println("the total marks "+calculateTotalMarks());
            System.out.println("the average "+calculateAverageMarks());

        }else{
            System.out.println("Midterm or Final Exam not attempted. Total score not available");
        }
    }

    public static void main(String[] args) {
        Student1 std1=new Student1("keza",-9,0,88,25677);
        Student1 std2=new Student1("debby",77,69.5,98,26569);
        std1.displayStudentInfo();

    }


}
