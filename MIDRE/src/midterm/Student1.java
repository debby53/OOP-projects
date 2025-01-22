package midterm;

import java.util.Scanner;

public class Student1 {
    private String name;
    private int rollNumber;
    private int mathMarks;
    private int physicsMarks;
    private double averageMarks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        if (mathMarks >= 0 && mathMarks <= 100) {
            this.mathMarks = mathMarks;
        } else {
            System.out.println("please put the right marks (0-100)");
        }
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(int physicsMarks) {
        if (physicsMarks >= 0 && physicsMarks <= 100) {
            this.physicsMarks = physicsMarks;
        } else {
            System.out.println("please put the right marks (0-100)");
        }
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    public void setAverageMarks(double averageMarks) {
        this.averageMarks = averageMarks;
    }

    public double getTotal() {
        if (physicsMarks == 0 || mathMarks == 0) {
            System.out.println("physics or math are missing so we cannot calculate average");
            return -1;
        } else {
            return physicsMarks + mathMarks;
        }
    }

    public double getAverage() {
       double totalMarks = getTotal();
        if (totalMarks != -1) {
            return totalMarks / 2.0;
        } else {
            return 0.0;
        }
    }

    public boolean attemptedQuiz() {
        return mathMarks > 0 || physicsMarks>0;
    }

    public void displayInfo() {
        if (attemptedQuiz()) {
            System.out.println("student roll number: " + rollNumber);
            System.out.println("student name: " + name);
            System.out.println("physics marks: " + physicsMarks);
            System.out.println("math marks " + mathMarks);

           double totalMarks = getTotal();
            if (totalMarks != -1) {
                System.out.println(" the total marks: " + totalMarks);
                System.out.println("the average marks: " + getAverage());
            }


        } else {
            System.out.println("the student named " + name + "did not attempt quiz so average cannot be calculated");

        }
    }

    public static int getValidMarks(Scanner sc, String examType) {
        int marks = -1;
        while (marks < 0 || marks > 100) {
            System.out.println("enter: " + examType + "marks(0-100)");
            marks = sc.nextInt();
            if (marks < 0 || marks > 100){
                System.out.println("invalid output");
            }

        }
        return marks;
    }

    public static void main(String[] args) {
        Student1 st=new Student1();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student name");
        st.setName(sc.nextLine());
        System.out.println("enter student roll number");
        st.setRollNumber(sc.nextInt());
        int p=getValidMarks(sc,"physics");
        st.setPhysicsMarks(p);
        int m=getValidMarks(sc,"math");
        st.setMathMarks(m);
        st.displayInfo();
        sc.close();
    }
}