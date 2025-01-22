import java.util.Scanner;

public class Warehouse {
    private String warehouseName;
    private String location;
    private double stock;
    private double maxCapacity = 1000;
    private double minAllowedStock = 0;

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
        if (stock >= minAllowedStock && stock <= maxCapacity) {
            this.stock = stock;
        } else {
            System.out.println("the stock cannot go below 0 or above 1000");
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

    public double addStock(double amount) {

        if (amount >= 0 && (stock+amount) <= maxCapacity) {
            stock=+amount;
            System.out.println("stock well added");

        } else {
            System.out.println(" we cannot add stock");
        }
        return amount;
    }

    public void withdrawStock(double amount) {



        if (amount >=0  && (stock-amount) >= minAllowedStock) {
            stock +=amount;
            System.out.println("withdrwa successully");
        } else {
            System.out.println(" we cannot add stock");
        }


    }


    public void displayStockDetails(){
        System.out.println("the warehouse is "+warehouseName);
        System.out.println("location " +location);
        System.out.println("--------------------------");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Warehouse house=new Warehouse();
        System.out.println("enter warehouse name");
        String name=sc.nextLine();
        house.setWarehouseName(name);
        System.out.println("enter location");
        String loc=sc.nextLine();
        house.setLocation(loc);

        while (true) {
            System.out.print("Enter initial stock (between 0 and " + house.maxCapacity + "): ");
            double initialStock = sc.nextDouble();
            if (initialStock >= house.minAllowedStock && initialStock <= house.maxCapacity) {
                house.setStock(initialStock);
                break;
            } else {
                System.out.println("Invalid stock amount. Please enter a value between 0 and " + house.maxCapacity);
            }
        }


        while(true){
            System.out.println("enter amount for withdraw");
            double wihtdrawAmount=sc.nextDouble();
            if(wihtdrawAmount>=0 && (house.stock-wihtdrawAmount)>= house.minAllowedStock){
                house.withdrawStock(wihtdrawAmount);
                break;
            }else{
                System.out.println("try again the money to withdraw");
            }

        }
        while (true) {
            System.out.print("Enter amount to add to stock: ");
            double addAmount = sc.nextDouble();
            if (addAmount > 0 && (house.getStock() + addAmount) <= house.maxCapacity) {
                house.addStock(addAmount);
                break;
            } else {
                System.out.println("Invalid amount. Ensure it does not exceed maximum capacity. Try again.");
            }
        }



        house.displayStockDetails();




    }


}
