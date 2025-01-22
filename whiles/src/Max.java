import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        int max;
        System.out.println("enter a number");
        number=sc.nextInt();
        max=number;
        char choice;
        do{
            System.out.println("enter a number");
            number=sc.nextInt();
            if(number>max){
                max=number;
            }
            System.out.println("do want to insert another number");
            choice=sc.next().charAt(0);
        }
        while(choice=='y' || choice=='Y');
        System.out.println("the maximum is "+max);
    }
}
