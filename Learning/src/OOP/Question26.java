package OOP;
import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Are you married? (yes/no)");
        String maritalStatus = sc.nextLine().toLowerCase();
        if(maritalStatus.equals("yes"))
            System.out.println("you are eligible to be our driver");
        else
            System.out.println("enter your gender (female/male)");
        String gender = sc.nextLine().toLowerCase();
        System.out.println("enter your age");
        int age = sc.nextInt();
        if(gender.equals("male") && age>30)
            System.out.println("you are eligible to be our driver");
        else if (gender.equals("female") && age>25) {
            System.out.println("you are eligible to be our driver");

        }else
            System.out.println("we are sorry to let you know that you are not qualified to be our driver");
    }
}
