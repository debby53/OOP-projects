package ONLINE_SHOPPING;

import java.util.Date;

public class Grocery extends Product{
    private Date expiryDate;

    public Grocery(int productId, String name, double price, Date expiryDate)throws InvalidRegistrationException {
        super(productId, name, price);
        if(expiryDate.before(new Date()))throw new InvalidRegistrationException("expiry date must be in the future");
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDetails() {
        return "Grocery [ID: " + getProductId() + ", Name: " + getName() +
                ", Price: " + getPrice() + ", Expiry Date: " + expiryDate + "]";

    }
}
