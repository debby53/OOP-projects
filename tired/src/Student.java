import java.util.Scanner;

public class Student {
    private  String name;
    private int rollNumber;
    private int mathMarks;
    private int physicsMarks;
    private double averageMarks;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

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
        if(mathMarks>=0 && mathMarks<=100) {
            this.mathMarks = mathMarks;
            calculateAverage();
        }
        else{
            System.out.println("invalid math marks ");
        }
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(int physicsMarks) {
        if(physicsMarks>=0 && physicsMarks<=100){
        this.physicsMarks = physicsMarks;
            calculateAverage();
        }else{
            System.out.println("invalid physics marks");
        }
    }
    public void  calculateAverage(){
        this.averageMarks=(physicsMarks+mathMarks)/2.0;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

   public void inputMarks(){
       Scanner sc=new Scanner(System.in);
       while(true){
           System.out.println("enter math marks for "+name);
           int inputMathMarks=sc.nextInt();
           if(mathMarks>=0 && mathMarks<=100){
             setMathMarks(inputMathMarks);
             break;
           }else{
               System.out.println("invalid input math marks please try again");
           }
       }
       while (true){
           System.out.println("enter physics marks for "+name);
           int inputPhyMarks=sc.nextInt();
           if(physicsMarks>=0 && physicsMarks<=100){
               setPhysicsMarks(inputPhyMarks);
               break;
           }else {
               System.out.println("invalid input please try again");
           }

       }
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1; i<=3; i++){
            System.out.println("enter name for student "+ i + ":");
            String name=sc.nextLine();
            System.out.println("enter roll number for student "+i +":");
            int rollNumber=sc.nextInt();
            sc.nextLine();

            Student student=new Student(name,rollNumber);
            student.inputMarks();

            System.out.println("student" + " details");
            System.out.println("name "+ student.getName());
            System.out.println("rollnumber "+ student.getRollNumber());
            System.out.println("physics marks "+student.getPhysicsMarks());
            System.out.println("math marks "+student.getMathMarks());
            System.out.println("average is "+ student.getAverageMarks());
            System.out.println("-----------------------------------");
        }
    }



}
