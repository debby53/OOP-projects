package loops;
import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sodaPrice=25;
        int chipsPrice=14;
        int candPrice=2;

        int choice=0;
        int totalMoney=0;
        int itemPrice=0;
        System.out.println("WELCOME TO VENDING MACHINE");
        System.out.println("1.soda ($25)");
        System.out.println("2.chips ($14)");
        System.out.println("3. candy ($2)");
        System.out.println("please choose a statement by adding money");

        choice= sc.nextInt();
        switch (choice){
            case 1:
            itemPrice=sodaPrice;
            System.out.println("u selected soda so the price is $25");
            break;
            case 2:
            itemPrice=chipsPrice;
            System.out.println("u selected soda so the price is $14");
            break;
            case 3:
            itemPrice=candPrice;
            System.out.println("u selected soda so the price is $2");
            break;
            default:
                System.out.println("invalid choice! please restart the machine");
        }
        do{
            System.out.println ("Enter money " + totalMoney );
            totalMoney= sc.nextInt();

            if(totalMoney <itemPrice){
                System.out.println(" please add this amount of money "+ (itemPrice - totalMoney));
            }
        }
        while(totalMoney < itemPrice);
        if(totalMoney > itemPrice){
            System.out.println("your entered "+totalMoney + "and your change is "+(totalMoney - itemPrice));
        }
        System.out.println("dispensing your item. enjoy your purchase");
    }

}
