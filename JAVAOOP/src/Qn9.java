import java.util.Scanner;

public class Qn9 {
    public static void main(String[] args) {

   int n;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<10){
            System.out.println("less than 10");
        } else if (n>5) {
            System.out.println("greater than 5");

        }else {
            System.out.println("not interesting");
        }
    }

}
