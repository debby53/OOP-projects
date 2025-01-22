package OOP;
import java.util.Scanner;
public class Question21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter electricity units");
        int units=sc.nextInt();
        double totalBill=0.0;
        if(units<=50)
            totalBill=units*0.50;
        else if (units<=200) {
            totalBill=(50*0.50) + (units-50)*0.75;

        } else if (units<=450) {
            totalBill=(50*0.50)+(150*0.75)+(units-200)*1.20;

        }else{
            totalBill=(50*0.50)+(150*0.75)+(250*1.20)+(units-450)*1.50;
        }
        double surcharge=totalBill*0.20;
        totalBill +=surcharge;
        System.out.println("total electricity bill (including surcharge) is: Rs. " + totalBill);
    }

}
