import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks= sc.nextInt();

        switch(marks){
            case 15:
            case 16:
            case 17:

            System.out.println("distinction");
            break;




            default:
                System.out.println("fail");
        }

    }
}
