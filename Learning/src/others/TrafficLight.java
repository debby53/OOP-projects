package others;
import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the color you are seeing in traffic light");
        String light=sc.nextLine();
        switch(light){
            case "yellow":
                System.out.println("wait");
                break;
            case "green":
                System.out.println("go");
                break;
            case "red":
                    System.out.println("stop");
                    break;
            default:
                System.out.println("ivalid output");
        }
    }
}
