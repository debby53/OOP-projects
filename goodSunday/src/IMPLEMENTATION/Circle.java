package IMPLEMENTATION;

public class Circle implements Shape{
    double r;
    double s;
    @Override
    public void area() {

       double resultArea=3.14*r*r;
        System.out.println(resultArea);


    }

    @Override
    public void perimeter( ) {
       double  resultPerimeter=s*s;
        System.out.println(resultPerimeter);


    }
}
