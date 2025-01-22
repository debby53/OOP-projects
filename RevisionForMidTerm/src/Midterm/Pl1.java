package Midterm;

import javax.imageio.stream.ImageInputStream;

public class Pl1 {
    private String name;
    private int quizMarks;
    private int midTermMarks;
    private int finalExamMarks;

    public Pl1(String name, int quizMarks, int midTermMarks, int finalExamMarks) {
        this.name = name;
        this.quizMarks = quizMarks;
        this.midTermMarks = midTermMarks;
        this.finalExamMarks = finalExamMarks;
    }

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
            System.out.println("invalid  quiz marks , the range is (0-100)");
            this.quizMarks=0;
        }
    }

    public int getMidTermMarks() {
        return midTermMarks;
    }

    public void setMidTermMarks(int midTermMarks) {
        if(midTermMarks>=0 && midTermMarks<=100) {
            this.midTermMarks = midTermMarks;
        }else{
            System.out.println("invalid mid  marks , the range is (0-100)");
            this.midTermMarks=0;
        }
    }

    public int getFinalExamMarks() {
        return finalExamMarks;
    }

    public void setFinalExamMarks(int finalExamMarks) {
        if(finalExamMarks>=0 && finalExamMarks<=100) {
            this.finalExamMarks = finalExamMarks;
        }else {
            System.out.println("invalid  final marks , the range is (0-100)");
            this.finalExamMarks=0;
        }
    }
    public double totalMarks(){
        return (finalExamMarks+midTermMarks+quizMarks);
    }
    public void displayStudentInfo(){
        System.out.println("names "+name);
        System.out.println("quiz marks "+quizMarks);
        if(quizMarks>0  && midTermMarks>0 &&  finalExamMarks>0){
            System.out.println("quiz marks "+quizMarks);
            System.out.println("midterm marks "+midTermMarks);
            System.out.println("final marks "+finalExamMarks);
            System.out.println("total marks "+totalMarks());
        }else{
            System.out.println("all marks must be valid ");
        }

    }

    public static void main(String[] args) {
        Pl1 p1=new Pl1("debby",-9,16,18);
        p1.displayStudentInfo();
    }
}
