package OOP;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month number (1-12) :");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("january");
                break;
                case 2:
                    System.out.println("february");
                    break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October" );

                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("invalid month number");



        }
    }
}
