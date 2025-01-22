package SYSTEM;

public class Clothing extends Product {
    String size;
    String material;

    @Override
    public void getDiscountPrice() {
        if(size.equalsIgnoreCase("l,m,s") && material.equalsIgnoreCase("jampas, pyjamas")){
            System.out.println("allowed for clothing discount");
        }else {
            System.out.println("no discount");
        }
    }
    public void displayProuctDetail(){
        System.out.println("the product is  "+this.name);
        System.out.println("the material is "+material);
        System.out.println("the size is "+size);
        System.out.println("its price is "+price);
    }
}
