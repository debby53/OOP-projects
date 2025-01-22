package loops;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         int correctPin=12345;
        int enteredPin ;
        do {
            System.out.println("enter your pin");
            enteredPin= sc.nextInt();
            if(enteredPin!=correctPin){
                System.out.println("incorrect password! prease try again");
            }




        }
        while(enteredPin !=correctPin);
        System.out.println("password accepted, you have access to your account");

    }
}
