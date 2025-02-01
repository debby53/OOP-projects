import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return width*height;
    }
    public double calculatPerimeter(){
        return (width+height)*2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter width");
        double width=sc.nextDouble();
        System.out.println("enter height");
        double height=sc.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);


        rectangle.calculateArea();
        rectangle.calculatPerimeter();
        System.out.println("the area is "+rectangle.calculatPerimeter());
        System.out.println("the perimeter is "+rectangle.calculateArea());



    }
}

