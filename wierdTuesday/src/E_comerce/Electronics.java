package E_comerce;

public class Electronics extends Product {
   private int warrantyPeriod;
   public String brand;

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if(warrantyPeriod<=12) {
            this.warrantyPeriod = warrantyPeriod;
        }else{
            System.out.println("warrant cannot go above 1 year");
        }
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        if(brand.equalsIgnoreCase("lenovo")) {
            this.brand = brand;
        }else{
            System.out.println("the brand is only lenovo");
        }
    }

    @Override
    public double getDiscountedPrice() {
        return 0.0;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
    }
}
