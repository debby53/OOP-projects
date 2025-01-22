import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
       int guesedNumber;
        int correctNumber=57;
        do{
            System.out.println("guess number (1-100)");
             guesedNumber=sc.nextInt();
            if(guesedNumber!=correctNumber){
                System.out.println(" incorrect! guess number again ");
            }
        }
        while(guesedNumber!=correctNumber);
        System.out.println("u won");
    }
}
