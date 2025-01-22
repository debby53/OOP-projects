package E_COMMERCE_ORDER_SYSTEM;

public class Customer {
    private String name;
    private String email;
    private String address;

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void placeOrder(Product product){
        System.out.println("the order placed by "+name);
        System.out.println("the email is "+email);
        System.out.println("the addres is "+address);
        System.out.println("the name of product is "+product.getName());
        System.out.println("the price is "+product.getName());
        System.out.println("the weightflied is "+product.getWeightFields());
    }
}
