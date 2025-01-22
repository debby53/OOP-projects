package method2;

import java.util.Scanner;

public class Qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first name");
        System.out.println("enter last name");
        twoStrings(sc.nextLine(), sc.nextLine());
    }
    public static void twoStrings(String fName,String lName){
        String result=lName +" " +fName;
        System.out.println( "the concatenation is  "   + result);

    }
}
