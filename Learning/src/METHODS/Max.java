package METHODS;
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");

        System.out.println("enter b");

        System.out.println("enter c");

        max(sc.nextInt(),sc.nextInt(),sc.nextInt());
    }
    public static void max(int a,int b,int c){
        if(a>b && a>c) {
            System.out.println(a +" is the maximum");

        } else if (b>a && b>c) {
            System.out.println(b +" is the maximum ");

        } else if (c>a && c>b) {
            System.out.println(c + " is the maximum");

        }else
            System.out.println("no maximum they are all equal");
    }
}
