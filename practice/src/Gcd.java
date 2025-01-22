import java.util.Scanner;

public class Gcd {


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number 1");
            int num1=sc.nextInt();
            System.out.println("enter number 2");
            int num2=sc.nextInt();
            int Gcd=1;
            int i;
            for(i=1; i<=num1 && i<=num2; i++){
                if(num1%i==0 && num2%i==0){
                    Gcd=i;
                }

            }
            System.out.println(Gcd);
        }


    }
