package E_COMMERCE_ORDER_SYSTEM;

public class Electronics extends Product{
    public Electronics(String name, double price, double weightFields) {
        super(name, price, weightFields);
    }

    @Override
    public double calculateShippingCost() {
        return getWeightFields()*10;
    }

    @Override
    public void getDeliveryTime() {
        System.out.println("the delivery of electonics is 30-50 days");
    }
}
