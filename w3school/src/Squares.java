import  java.util.Scanner;
public class Squares {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any natural number");
        int N= sc.nextInt();
        int sum=0;
        int product;
        int i=1;
        while(i<=N){
            product=i*i;
            sum=sum+product;
            i++;
        }
        System.out.println(sum);
    }
}
