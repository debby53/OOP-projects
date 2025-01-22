package OOP;
import java.util.Scanner;

public class Question11 {

    private static String day_is_wednesday;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a week number");
        int num=sc.nextInt();
        if(num==1)
            System.out.println("the day is Monday");
        else if (num==2) {
            System.out.println("the day is tuesday");

        } else if (num==3) {
            System.out.println("the day is wednesday");

        } else if (num==4) {
            System.out.println("thursday");

        } else if (num==5) {
            System.out.println("friday");

        } else if (num==6) {
            System.out.println("saturday");

        } else if (num==7) {
            System.out.println("sunday");

        }else
            System.out.println("this day of the week does'nt exist");


    }
}
