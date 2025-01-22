import java.util.Scanner;


public class Deborahc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1= sc.nextInt();
        System.out.println("enter num2");
        int num2= sc.nextInt();
        System.out.println("enter num3");
        int num3=sc.nextInt();
        int sum=num1+num2+num3;
        double average =sum/3;
        System.out.println("the sum : "+sum);
        System.out.println("the average : "+average);
        if(average>18)
            System.out.println("grade A");
        else if (average>16 && average<18) {
            System.out.println("Grade B");


        }
        else
            System.out.println(" Grade c");


    }
}
