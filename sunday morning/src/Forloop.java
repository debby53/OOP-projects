import java.util.Scanner;
public class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num= sc.nextInt();

        for(int i=num ; i<=20; i++){

            System.out.println(i);
        }
    }
}
