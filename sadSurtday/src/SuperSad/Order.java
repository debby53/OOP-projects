package SuperSad;

import java.util.Scanner;

public class Order {
    private int ProductID;
    private String ProductName;
    private double Price;
    private int QuantityInStock;
    private String Category;

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            Price = price;
        } else {
            System.out.println("the price should be above 0");
        }
    }

    public int getQuantityInStock() {
        return QuantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock >= 0) {
            QuantityInStock = quantityInStock;
        } else {
            System.out.println("quantity should be above 0");
        }
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        if (category.equalsIgnoreCase("electonics") || category.equalsIgnoreCase("clothes") || category.equalsIgnoreCase("food")) {
            Category = category;
        } else {
            System.out.println("the category should be among clothes,food,electonics");
        }
    }

    public double orderProduct(double totalPrice) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter product id");
        int enteredProductId = sc.nextInt();
        setProductID(enteredProductId);
        System.out.println("enter quantity you want to buy");
        int enteredQuantity = sc.nextInt();
        if (enteredQuantity > 0 && enteredQuantity <= this.QuantityInStock) {

            System.out.println("order placed successfully");
            totalPrice = this.Price * enteredProductId;
            int remainingStock = (this.QuantityInStock - enteredQuantity);
        } else {
            System.out.println("quantity u want not available");
        }
        return totalPrice;
    }

    public void makepayment() {
        System.out.println("payment made successfully");

    }

    public void validation() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter initial quantity in stock");
            int quantity = sc.nextInt();
            if (quantity >= 0) {
                setQuantityInStock(quantity);
                break;
            }

        else{
                System.out.println("try again");
            }
        }
        while (true){
            System.out.println("enter the price");
            double pricee=sc.nextDouble();
            if(pricee>=0){
                setPrice(pricee);
                break;
            }else{
                System.out.println("please try to enter correct price");
            }
        }
        while(true){
            System.out.println("enter category");
            String cate=sc.nextLine();
            if(cate.equalsIgnoreCase("electronics")|| cate.equalsIgnoreCase("food")|| cate.equalsIgnoreCase("clothes")){
                setCategory(cate);
                break;
            }else{
                System.out.println("please try again");
            }
        }
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Order order=new Order();

        while(true){
            System.out.println("enter quantity u want to buyy");
            int quantityy=sc.nextInt();
            if(quantityy>=0){
                order.orderProduct(quantityy);
                break;
            }else{
                System.out.println("quantity is above 0 try again");
            }
        }
        order.validation();
        order.makepayment();
    }
}
