import java.util.Scanner;
public class Nnumbrs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n= sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=n){
            sum=sum+(i*i );
                    i++;

        }
        System.out.println(sum);
    }
}
