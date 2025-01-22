package Midterm;

public class WareHouse {
    private String warehouseName;
    private String location;
    private double stock;
    private double maxCapacity=1000.0;
    private    double minAllowedStock=0.0;

    public WareHouse(String warehouseName, String location, double stock, double maxCapacity, double minAllowedStock) {
        this.warehouseName = warehouseName;
        this.location = location;
        this.stock = stock;
        this.maxCapacity = maxCapacity;
        this.minAllowedStock = minAllowedStock;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        if(stock>=minAllowedStock && stock<=maxCapacity) {
            this.stock = stock;
        }else{
            System.out.println("invalid stock");
            this.stock=0;
        }
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getMinAllowedStock() {
        return minAllowedStock;
    }

    public void setMinAllowedStock(double minAllowedStock) {
        this.minAllowedStock = minAllowedStock;
    }
    public void addStock(double amount){
        if(amount<0){
            System.out.println("invalid , cannot add negative stock");
        } else if (amount+this.stock>maxCapacity) {
            System.out.println("it exceeds maxim capacity we cannot add it "+amount +"kg");
            
        }else{
            this.stock+=amount;
            System.out.println(amount + " kg added. Current stock: " + this.stock + " kg.");
        }
    }
    public void withDrawStock(double amount){
        if(amount<0) {
            System.out.println("invalid input ,we cannot withdraw negative nbrs");
        } else if (this.stock-amount<minAllowedStock) {
            System.out.println("insufficient stock");
            
        }else{
            this.stock-=amount;
            System.out.println(amount + " kg withdrawn. Current stock: " + this.stock + "kg.");
        }
    }
    public void displayWarehouseInfo(){
        System.out.println("the name of warehouse: "+warehouseName);
        System.out.println("where its located: "+location);
        System.out.println("current stoc : "+stock);
        System.out.println("maximum capacity: " +maxCapacity);
    }

    public static void main(String[] args) {
        WareHouse warehouse=new WareHouse("majerwa","kicukiro",500,1000,0);
        warehouse.addStock(100);
        warehouse.addStock(200);
        warehouse.withDrawStock(300);
        warehouse.displayWarehouseInfo();
    }
}
