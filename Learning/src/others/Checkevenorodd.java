package others;
import java.util.Scanner;
public class Checkevenorodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n number");
        int num= sc.nextInt();

        switch(num%2){
            case 0:

                System.out.println("its even number " +num);
                break;
            case 1:
            case -1:


                System.out.println("its odd number "+num);
                break;
            default:
                System.out.println("invalid output");
        }
    }
}
