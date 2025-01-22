package OOP;
import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println("write a character: ");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z')
            System.out.println(ch +" is lowercase ");
        else if (ch>='A' && ch<='Z') {
            System.out.println(ch +" is an an uppercase");

        }
    }
}
