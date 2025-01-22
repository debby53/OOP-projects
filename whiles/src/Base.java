import java.util.Scanner;
public class Base {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a base");
        int base=sc.nextInt();
        System.out.println("enter exponent");
        int exponent=sc.nextInt();
        int result =1;
        int i=0;
        while(i<exponent){
            result=result*base;
            i++;
        }
        System.out.println(result);
    }
}
