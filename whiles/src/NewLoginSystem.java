import java.util.Scanner;

public class NewLoginSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String correctUserName="debby@ash";
        String correctPassword="123";
        String enteredPassword;
        String enteredUserName;
        int attempts=0;
        int max_attempts=3;

        do{
            System.out.println("enter your username");
            enteredUserName= sc.nextLine();
            System.out.println("enter your password");
            enteredPassword= sc.nextLine();
            if(enteredUserName.equals(correctUserName) && enteredPassword.equals(correctPassword)){
                System.out.println("access granted");
            }
            else{
                attempts++;
                System.out.println("incorrect password or username, please try again");
                System.out.println("attempts left "+(max_attempts-attempts));
            }
        }
        while(attempts<max_attempts);
        if(attempts==max_attempts){
            System.out.println("no attempts left access denied");
        }
    }
}
