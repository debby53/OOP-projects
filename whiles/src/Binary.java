import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a decimal number");
        int decimalNumber= sc.nextInt();
        String binary="";
        while(decimalNumber>0){
            int remainder=decimalNumber%2;
            binary=+remainder+binary;
            decimalNumber=decimalNumber/2;
        }
        System.out.println(binary);
    }
}
