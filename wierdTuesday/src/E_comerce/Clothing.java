package E_comerce;

public class Clothing extends Product{
    private String  size;
    private String material;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size.equalsIgnoreCase("L")||size.equalsIgnoreCase("m")) {
            this.size = size;
        }else{
            System.out.println("the size should be l and m");
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if(material.equalsIgnoreCase("jampa")){
            this.material = material;
        }else{
            System.out.println("we sell ony jampas");
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
