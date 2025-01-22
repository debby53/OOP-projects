import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("option 1 -say hey bby gal");
            System.out.println("option 2 -add two numbers");
            System.out.println("option 3 -check odd or even");
            System.out.println("option 4 -exit");

            System.out.println("choose the option you want (1-4");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("hey bby gal");
                break;
            } else if (choice == 2) {
                System.out.println("enter two numbers you want to add");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int sum = num2 + num1;
                System.out.println("the sum is " + sum);
                break;

            } else if (choice == 3) {
                System.out.println("enter a number");
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    System.out.println("even number");
                } else {
                    System.out.println("odd number");
                }

break;
            } else if (choice==4) {
                System.out.println("exit");
break;
            }
            else {
                System.out.println("invalid choice");
                break;
            }
        }
        while(choice!=4);
    }
}
