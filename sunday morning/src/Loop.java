import java.util.Scanner;

import  java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        for(int i=10; i<=50; i++){
            if(num>100)
                System.out.println(i);
            else
                System.out.println("no action");
        }
    }
}



