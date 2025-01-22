import java.util.Scanner;
public class Pin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO AT MACHINE");
        int enteredPin;
        int correctPin=12345;
        do{
            System.out.println("enter your pin");
             enteredPin= sc.nextInt();
            if(enteredPin!=correctPin){
                System.out.println("incorrect password, enter your pin again");
            }
        }
        while(enteredPin!=correctPin);
        System.out.println("granted access");


    }
}
