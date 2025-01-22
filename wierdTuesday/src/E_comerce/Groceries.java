package E_comerce;

public class Groceries extends Product{
 private String expiryDate;
 private String restrictDiscount;

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getRestrictDiscount() {
        return restrictDiscount;
    }

    public void setRestrictDiscount(String restrictDiscount) {
        this.restrictDiscount = restrictDiscount;
    }
    public void isNearExpiry(){

    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
    }
}
