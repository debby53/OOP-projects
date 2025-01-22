package IMPLEMENTATION;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circlee circlee=new Circlee();
        Rectangle rectangle=new Rectangle();
        System.out.println("enter radius");
        circlee.radius=sc.nextInt();
        System.out.println("enter width");
        rectangle.width=sc.nextDouble();
        System.out.println("enter length");
        rectangle.length=sc.nextDouble();
        circlee.getArea();
        circlee.getArea();
        rectangle.getPerimetr();
        rectangle.getArea();
    }
}
