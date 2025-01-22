package E_COMMERCE_ORDER_SYSTEM;

public class Furniture extends Product{
    public Furniture(String name, double price, double weightFields) {
        super(name, price, weightFields);
    }

    @Override
    public double calculateShippingCost() {
        return getWeightFields()*5.0;
    }

    @Override
    public void getDeliveryTime() {
        System.out.println("delivary time is 10-30 days of working hours");

    }
}
