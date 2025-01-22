package IMPLEMENTATION;

public class Rectangle implements Shape{
    double length;
    double width;
    @Override
    public void getArea() {
        double result=length*width;
        System.out.println("the area of a rectangle is "+result);

    }

    @Override
    public void getPerimetr() {
      double result=(length+width)*2;
        System.out.println("the perimeter of a rectangle is "+result);
    }
}
