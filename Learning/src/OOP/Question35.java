package OOP;
import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter time taken by the worker to complete a certain task");
        int time = sc.nextInt();
        if(time>=2 && time<=3)
            System.out.println("the worker is highly efficient");
        else if (time>=3 && time<=4) {
            System.out.println("improve speed");

        } else if (time>=4 && time<=5) {
            System.out.println("start trainings");

        } else if (time>5) {
            System.out.println("leave the company");

        }else
            System.out.println(" wrong input. time should start from 2 hours and above");

    }
}
