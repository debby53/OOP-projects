import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int i;
        int isPrime=1;
        if(num<2){
            isPrime=0;
        }else{



            for(i=2; i<=num/2; i++){
                if(num%i==0) {
                    isPrime = 0;
                    break;
                }
            }
        }
            if(isPrime==1){
                System.out.println("is prime number");
            }else{
                System.out.println("not");
            }
            }

    }

