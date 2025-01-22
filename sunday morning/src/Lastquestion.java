import java.util.Scanner;

public class Lastquestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        int marks = 0;
        marks= sc.nextInt();
        switch(marks){
            case 80:
            case 90:
            case 100:
                System.out.println("A");
                break;
            case 69:
            case 70:
            case 71:
            case 72:
            case 76:
            case 79:
                System.out.println("B");
                break;
            case 50:
            case 55:
            case 58:
            case 60:
            case 65:
            case 68:
                System.out.println("c");
                break;
            default:
                System.out.println("D");

        }

    }
}
