package others;
import java.util.Scanner;
public class Alphabtes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter alphabet");
        char ch=sc.next().charAt(0);
        switch (ch){
            case 'a':
            case 'u':
            case 'i':
            case 'o':
            case 'e':
                System.out.println(" its a vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'r':
            case 'p':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            case 'Z':
                System.out.println(" its a consonant");
                break;
            default:
                System.out.println("invalid output");

        }
    }
}
