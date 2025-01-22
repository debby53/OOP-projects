package QUESTIONS;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("lowercase");
        } else if (ch>='A' && ch<='Z') {
            System.out.println("upper");


        }else
            System.out.println("ivalid output");

    }
}
