package SYSTEM;

public class Electronics extends Product {
    int warrantyPeriod;
    String brand;

    @Override
    public void getDiscountPrice() {
       if(brand.equalsIgnoreCase("apple")){
           System.out.println("discount allowed ");
       }else{
           System.out.println("no discount for other brands");
       }
    }
    public void displayProuctDetail(){
        System.out.println("the product is  "+this.name);
        System.out.println("its  warant period is "+warrantyPeriod);
        System.out.println("the brand is "+brand);
        System.out.println("the price is "+price);
        System.out.println("--------------------------");
    }
}
