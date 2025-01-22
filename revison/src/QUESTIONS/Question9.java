package QUESTIONS;
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);
                if(ch>='a' && ch<='z')
                    if(ch=='a' || ch=='i' || ch=='u' || ch=='o' || ch=='e')
                        System.out.println("its vowel");
                else
                        System.out.println("consonant");
    }
}
