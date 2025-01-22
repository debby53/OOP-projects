import java.util.Scanner;
public class AtmPin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int enteredPin;
        int correctPin=123;
        do{
            System.out.println("please enter your pin");
            enteredPin= sc.nextInt();
            if(enteredPin!=correctPin){
                System.out.println("incorrect pin please try again");
            }
        }
        while (enteredPin!=correctPin);
        System.out.println("correct password, access granted");
    }
}
