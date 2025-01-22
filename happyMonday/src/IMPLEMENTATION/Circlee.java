package IMPLEMENTATION;

public class Circlee implements Shape {
    int radius;
    @Override
    public void getArea() {
        double result=radius*radius*3.14;
        System.out.println("the area of a circle is "+result);
    }

    @Override
    public void getPerimetr() {
        double result=radius*2*3.14;
        System.out.println("the perimeter of a circle is "+result);

    }
}
