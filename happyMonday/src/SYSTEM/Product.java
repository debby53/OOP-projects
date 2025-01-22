package SYSTEM;

public class Product {
    int productId;
    String name;
    double price;

    public void getDiscountPrice(){
        if(price>5000){
            System.out.println("allowed to get discount");
        }else{
            System.out.println("no discount");
        }
    }


    public void displayProuctDetail(){
        System.out.println("the product is  "+name);
        System.out.println("the product id is  "+productId);
        System.out.println("the price is "+price);
        System.out.println("________________________________");
    }

}
