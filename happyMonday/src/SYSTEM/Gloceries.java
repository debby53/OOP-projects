package SYSTEM;

public class Gloceries extends Product {
    String expiryDate;
    double discount=0.10;

    public void isNearExpiry(){
        if(expiryDate.equalsIgnoreCase("04/12/2024")){
            this.price=this.price*discount;

            System.out.println("the products is about to expire");
            System.out.println("the real price now is "+ this.price);
        }else{
            System.out.println("we still have months");
        }

    }
    public void displayProuctDetail(){
        System.out.println("the product is  "+name);
        System.out.println("the product id is  "+productId);
        System.out.println("the price is "+price);
        System.out.println("te expiry date is "+expiryDate);
    }

}
