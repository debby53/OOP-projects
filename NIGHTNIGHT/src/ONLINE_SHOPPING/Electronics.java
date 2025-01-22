package ONLINE_SHOPPING;

public class Electronics extends Product{
    private int warrantyPeriod;

    public Electronics(int productId, String name, double price,int warrantyPeriod) throws InvalidRegistrationException {
        super(productId, name, price);
        if(warrantyPeriod<0)throw new InvalidRegistrationException("the warranty peruod must be gerater than 0");
        this.warrantyPeriod=warrantyPeriod;
    }

    @Override
    public String getDetails() {
        return "electonics [id " +getProductId() + ", name "+getName() + ",price "+getPrice() + "warranty period "+warrantyPeriod + "in months]";

    }
}
