package method2;

import java.util.Scanner;

public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        System.out.println("enter b");
        System.out.println("enter c");
        maximumOfThreeNumbers(sc.nextInt(), sc.nextInt(), sc.nextInt());

    }
    public  static void maximumOfThreeNumbers(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("a is the maximum");
        } else if (b>a && b>c) {
            System.out.println("b is the maximum");

        }
        else{
            System.out.println("c is the maximum");
        }

    }
}
