import java.util.Scanner;
public class Gamechoice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to a guessing game");
        System.out.println("guess a number between 1-100");
          int guessedNumber=0;
        int targetNumber=57;
        while(guessedNumber!=targetNumber){
            System.out.println("enter your guess");
            guessedNumber=sc.nextInt();
            if(guessedNumber>targetNumber){
                System.out.println("the number is too high");
            } else if (guessedNumber<targetNumber) {
                System.out.println("the nbr is low");

            }else{
                System.out.println("congz!,you won");
            }


        }

    }

}
