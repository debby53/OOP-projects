package others;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number a ");
        int a= sc.nextInt();
        System.out.println("enter a number b ");
        int b= sc.nextInt();
        int c;
        System.out.println("enter operator");
        char operator=sc.next().charAt(0);
        switch (operator){
            case '+':
                c=a+b;
                System.out.println("the answer is "+c);
                break;
            case '-' :
                c=a-b;
                System.out.println("the answer is "+c);
                break;
                case '*' :
                    c=a*b;
                    System.out.println("the answer is "+c);
                    break;
                    case '/' :
                        c=a/b;
                        System.out.println("the answer is "+c);
                        break;
            default:
                System.out.println("no operator available");

        }
    }
}
