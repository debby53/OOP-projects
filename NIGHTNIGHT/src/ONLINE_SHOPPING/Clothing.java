package ONLINE_SHOPPING;

public class Clothing extends   Product{
    private String size;

    public Clothing(int productId, String name, double price,String size) throws InvalidRegistrationException {
        super(productId, name, price);
        if(!size.matches("S|M|L|XL"))throw new InvalidRegistrationException("choose size btn S,M,L,XL");
        this.size=size;
    }

    @Override
    public String getDetails() {
        return "Clothing [ID: " + getProductId() + ", Name: " + getName() +
                ", Price: " + getPrice() + ", Size: " + size + "]";

    }
}
