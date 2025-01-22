package SMART_HOME_SYSTEM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            double cons=-1;
            while (cons<0){
                System.out.println("enter enery donsu");
                try {
                    cons=Double.parseDouble(sc.nextLine());
                    if(cons<0){
                        System.out.println("energe cannot go beyong zero try again");
                    }
                }catch (NumberFormatException e){
                    System.out.println("error");
                }
            }
            System.out.println("enter your name");
            String name=sc.nextLine();
            Camera camera=new Camera(name,cons);
            camera.turnOff();
            camera.turnOn();
            camera.displayDeviceDetails();
        }catch (Exception e){
            System.out.println("error "+e.getMessage());
        }
    }
}
