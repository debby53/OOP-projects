package loops;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1= sc.nextInt();
        System.out.println("enter num2");
        int num2= sc.nextInt();
        int a=num1;
        int b=num2;
        while(b!=0){
            int remainder=a%b;
            a=b;
            b=remainder;
        }
        System.out.println(a);
    }
}
