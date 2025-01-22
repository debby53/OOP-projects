package ONLINE_SHOPPING;

import java.util.ArrayList;

public class Customer extends User{
    private String address;
    private ArrayList<Product>cart=new ArrayList<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws InvalidRegistrationException {
        if(address.isEmpty()) throw new InvalidRegistrationException("address cannot be empty");
        this.address = address;
    }



    public Customer(int userId, String name, String email, String password) {
        super(userId, name, email, password);
    }
    public void addToCart(Product product)throws InvalidCartException{
        if(cart.contains(product)) {
            throw new InvalidCartException("product is already in the cart");
        }
        cart.add(product);

    }
    public void removeFromCart(int productId)throws InvalidCartException{
        Product toRemove=null;
        for(Product product:cart){
            if(product.getProductId()==productId){
                toRemove=product;
                break;
            }
        }
        if(toRemove==null)throw new InvalidCartException("product not found in the cart");
        cart.remove(toRemove);
        System.out.println("product removed from cart "+ toRemove.getName());

    }
    public void viewCart(){
        System.out.println("shopping cart");
        for(Product product:cart){
            System.out.println(product.getDetails());
        }
    }
}
