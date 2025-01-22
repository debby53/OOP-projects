import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(num<=10)
            for(int i=1; i<=50; i++)
            switch(i%num){
                case 0:
                    System.out.println("i");
                    break;

                default:
                        System.out.println("invalid");
            }
    }
}
