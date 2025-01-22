package midterm;

import java.util.Scanner;

public class Warehouse {
   private String warehouseName;
   private String location;
  private double   stock;
    private double  maxCapacity;
    private double  minAllowedStock;

    public Warehouse(String warehouseName, String location, double stock) {
        this.warehouseName = warehouseName;
        this.location = location;
        this.stock = stock;
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
        if (stock >= minAllowedStock && stock <= minAllowedStock) {
            this.stock = stock;
        } else {
            System.out.println("please put in good stock amount");
            this.stock = 0;
        }
    }
    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        if(maxCapacity<=1000) {
            this.maxCapacity = maxCapacity;
        }else{
            System.out.println("the maximum is 1000");
        }
    }

    public double getMinAllowedStock() {
        return minAllowedStock;
    }

    public void setMinAllowedStock(double minAllowedStock) {
        if(minAllowedStock>=0) {
            this.minAllowedStock = minAllowedStock;
        }else {
            System.out.println("the minimum stock should not go under 0");
        }
    }
    public void addStock(double amount){

        if(amount<=0){
            System.out.println("the stock to be added must be a positive value");
        } else if (amount+stock>maxCapacity) {
            System.out.println("it exceeds the maximum stock");
        }else{
            amount+=stock;
            System.out.println("successfully added");
        }


    }
    public void withdrawStock(double amount){

        if(amount<0) {
            System.out.println("we cannot withdraw negative amount");
        } else if (amount-stock<minAllowedStock) {
            System.out.println("no enough amount");

        }else {
            amount-=stock;
            System.out.println("successfully withdrawn");
        }

    }
public static double getValidInputs(Scanner sc,String amountName){
        double inputs=-1;
        while(inputs<=0){
            System.out.println("enter "+amountName);
            inputs=sc.nextDouble();
            if(inputs<=0){
                System.out.println("please try again and input correct amount");
            }

        }
        return inputs;
}
    public void printStockDetails() {
        System.out.println("Warehouse Name: " + warehouseName);
        System.out.println("Location: " + location);
        System.out.println("Current Stock: " + stock + " kg");
        System.out.println("Max Capacity: " + maxCapacity + " kg");
        System.out.println("Min Allowed Stock: " + minAllowedStock + " kg");

    }
    public static void main(String[] args) {
        Warehouse w=new Warehouse("kicukiro","majerwa",10000);
        Scanner sc=new Scanner(System.in);
        w.addStock(500);


    }
}
