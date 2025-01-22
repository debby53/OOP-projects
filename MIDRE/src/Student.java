import java.util.Scanner;

public class Student {
    private String studentName;
    private double quizMarks;
    private double midtermMarks;
    private double finalMarks;
    private int ID;

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
        if (quizMarks >= 0 && quizMarks <= 100) {
            this.quizMarks = quizMarks;
        } else {
            System.out.println("invalid quiz marks the range is(0-100) ");

        }

    }

    public double getMidtermMarks() {
        return midtermMarks;
    }

    public void setMidtermMarks(double midtermMarks) {
        if (midtermMarks >= 0 && midtermMarks <= 100) {
            this.midtermMarks = midtermMarks;
        } else {
            System.out.println("invalid midterm marks the range should be btn (0-100");
        }
    }

    public double getFinalMarks() {
        return finalMarks;
    }

    public void setFinalMarks(double finalMarks) {
        if (finalMarks >= 0 && finalMarks <= 100) {
            this.finalMarks = finalMarks;
        } else {
            System.out.println("invalid finam marks the range is (0-100)");
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getTotalMarks() {
        if (midtermMarks == 0 || finalMarks == 0) {
            System.out.println("final marks or midterm marks are missing total cannot be calculated");
            return -1;
        } else {
            return midtermMarks + finalMarks + quizMarks;
        }

    }

    public double getAverage() {
        double totalMarks = getTotalMarks();
        if (totalMarks != -1) {
            return totalMarks / 5.0;
        } else {
            return 0.0;
        }
    }

    public boolean attemptedQuiz() {
        return quizMarks > 0;
    }

    public void displayStudentInfo() {
        if (attemptedQuiz()) {
            System.out.println("Student Name: " + studentName);
            System.out.println("student id: " + ID);
            System.out.println("Quiz Marks: " + quizMarks);
            System.out.println("Midterm Marks: " + midtermMarks);
            System.out.println("Final Exam Marks: " + finalMarks);

            double totalMarks = getTotalMarks();
            if (totalMarks != -1) {
                System.out.println("Total Marks: " + totalMarks);
                System.out.println("Average Marks out of 20: " + getAverage());
            }
        } else {
            System.out.println("student name " + studentName + " did not attempt quiz");
        }
    }

    public  static int getValidMarks(Scanner sc, String examType) {
        int marks = -1;
        while (marks < 0 || marks > 100) {
            System.out.println("enter " + examType + "marks(0-100)");
            marks=sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("invalid input please try again");
            }
        }
        return marks;

    }

    public static void main(String[] args) {
        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student name:");
        s.setStudentName(sc.nextLine());

        System.out.println("enter student id: ");
        s.setID(sc.nextInt());
        int quizMarks=getValidMarks(sc,"quiz marks");
        s.setQuizMarks(quizMarks);
        int midtermMarks=getValidMarks(sc,"midterm marks");
        s.setMidtermMarks(midtermMarks);
        int finalMarks=getValidMarks(sc,"final marks");
        s.setFinalMarks(finalMarks);
        s.displayStudentInfo();

        sc.close();
    }


}