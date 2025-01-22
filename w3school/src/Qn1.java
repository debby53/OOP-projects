
import java.util.Scanner;
public class Qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num= sc.nextInt();
        int i=0;
        while(i<=12){
            System.out.println(   num*i);
            i++;
        }
    }
}
