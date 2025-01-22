import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "12345";
        String correctUserName = "debby@ish";
        String enteredPassword;
        String enteredUserName;
        int attemps = 0;
        int maxAttemps = 3;
        do {
            System.out.println("enter your username");
            enteredUserName = sc.nextLine();

            System.out.println("enter your password");
            enteredPassword = sc.nextLine();

            if (enteredUserName.equals(correctUserName) && enteredPassword.equals(correctPassword)) {
                System.out.println("login granted");
            } else {
                attemps++;
                System.out.println("incorrect password and username");
                System.out.println("attemps left " + (maxAttemps - attemps));
            }


        }
        while(attemps<maxAttemps);
        if(attemps==maxAttemps){
            System.out.println(" attemps are over!  access deined");
        }


    }
}