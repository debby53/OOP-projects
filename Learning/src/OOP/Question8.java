package OOP;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an alphabet: ");
        char ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u')
                System.out.println(ch +" is a vowel");
        else
                System.out.println(ch +"is consonant");

    }
}
