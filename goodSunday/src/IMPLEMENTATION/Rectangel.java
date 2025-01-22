package IMPLEMENTATION;

public class Rectangel implements Shape{
    double l;
    double w;
    @Override
    public void area( ) {
      double  areaResult=l*w;


    }

    @Override
    public void perimeter() {
      double  resultPerimeter=(l+w)*2;

    }
}
