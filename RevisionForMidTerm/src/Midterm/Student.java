package Midterm;

import java.util.Scanner;

public class Student {
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
        if(mathMarks>=0 && mathMarks<=100){
            System.out.println(mathMarks);
            this.mathMarks = mathMarks;
        }else{
            System.out.println("please  marks  are in range of (0-100) so try a positive number");
        }
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(Scanner sc) {

        do{
            System.out.println("enter physics marks");
            physicsMarks= sc.nextInt();

            if(physicsMarks>=0 && physicsMarks<=100){
                System.out.println(mathMarks);
                this.physicsMarks = physicsMarks;
        }
            else{
                System.out.println("please marks are in range of  (0-100) so try a positive number");


        }
        }
        while(physicsMarks>=0 || physicsMarks<=100);

    }

    public double getAverageMarks() {
        return averageMarks;
    }

    public void setAverageMarks(double averageMarks) {
        this.averageMarks = averageMarks;
    }
    public void averageOfMarks(){
        averageMarks=(mathMarks+physicsMarks)/2;
        System.out.println( "the average is "  +averageMarks);
    }



    public static void main(String[] args) {
        Student std1=new Student();
        Student std2=new Student();
        Student std3=new Student();
        Scanner sc=new Scanner(System.in);


        System.out.println("enter student 1 name");
        std1.setName(sc.nextLine());

        sc.nextLine();
        System.out.println("enter student 1 roll number");
        std1.setRollNumber(sc.nextInt());

        System.out.println("enter student1 math marks");
        std1.setMathMarks(sc.nextInt());



        System.out.println("enter student 2 name");
        std2.setName(sc.nextLine());

        sc.nextLine();
        System.out.println("enter student 2 roll number");
        std2.setRollNumber(sc.nextInt());

        System.out.println("enter student2 math marks");
        std2.setMathMarks(sc.nextInt());




        System.out.println("enter student 3 name");
        std3.setName(sc.nextLine());

        sc.nextLine();
        System.out.println("enter student 3 roll number");
        std3.setRollNumber(sc.nextInt());

        System.out.println("enter student 3 math marks");
        std3.setMathMarks(sc.nextInt());


        std1.averageOfMarks();
        std3.averageOfMarks();
        std3.averageOfMarks();



    }
}
