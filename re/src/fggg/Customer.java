package fggg;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    private String address;
    private List<Product>cart=new ArrayList<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws  RegistrationException{
        if(address.isEmpty())throw new RegistrationException("EMAIL CANOT BE EMPTY");

        this.address = address;
    }

    public Customer(int userId, String name, String email, String password) throws RegistrationException{
        super(userId, name, email, password);
    }
    public void addToCart(Product product)throws CartException{
        if(cart.contains(product))throw new CartException("product is aready in the cart");
        cart.add(product);
    }
    public void removeFromCart(int productId)throws CartException{
        Product productToRemove=null;
        for(Product product:cart){
            if(product.getProductId()==productId){
                productToRemove=product;
                break;
            }
        }
        if(productToRemove==null){
            throw new CartException("product id "+productId + "not found in the cart");
        }
        cart.remove(productToRemove);
    }
    public List<Product>getCart(){
        return cart;
    }
    public void displayDetails() {
        System.out.println("Name: " + super.name + ", Address: " + address);
    }
    public  void viewCart(){
        if(cart.isEmpty()){
            System.out.println("cart is empty");
        }else{
            for(Product p:cart){
                System.out.println(p.getDetails());
            }
        }
    }

}
