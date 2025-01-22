package IMPLEMENTATION;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Rectangel rectangel = new Rectangel();
        Circle circle = new Circle();
        System.out.println("enter sides");
       int s=sc.nextInt();
       circle.perimeter();

        System.out.println("enter r");
        int u=sc.nextInt();
        circle.area();








    }

}
