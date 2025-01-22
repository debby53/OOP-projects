package OOP;
import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of a rectangle");
        int length= sc.nextInt();
        System.out.println("enter the breadth of a rectangle");
        int breadth= sc.nextInt();
        int area=breadth*length;
        int perimeter=2*(length+breadth);
                if(area>perimeter)
                    System.out.println("the area is greater than perimeter");
                else
                    System.out.println("the area is not greater than perimeter");
    }
}
