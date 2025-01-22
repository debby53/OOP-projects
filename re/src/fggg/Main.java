package fggg;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Product> products=new ArrayList<>();

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        products.add(new Electronics(101, "Laptop", 1200.00, 24));
        products.add(new Clothing(102, "Shirt", 40.50, "M"));
        products.add(new Grocery(103, "Milk", 3.99, LocalDate.of(2024, 12, 15)));
        Customer customer=null;
        boolean loggedIn=false;

        while (true){
            try{
                if(customer==null){
                    System.out.println("Register a new user:");
                    System.out.print("Enter user ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    System.out.print("Enter address: ");
                    String address = sc.nextLine();
                    customer = new Customer(userId, name, email, password);
                    customer.setAddress(address);
                    System.out.println("User registered successfully.");
                }
                else if (!loggedIn) {
                    System.out.println("Login:");
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    if (customer.login(email, password)) {
                        loggedIn = true;
                        System.out.println("Login successful.");
                    }
                } else {
                    System.out.println("1. View Products");
                    System.out.println("2. Add Product to Cart");
                    System.out.println("3. Remove Product from Cart");
                    System.out.println("4. View Cart");
                    System.out.println("5. Checkout");
                    System.out.println("6. Logout");
                    System.out.print("Enter your choice: ");
                    int choice = sc.nextInt();
                    sc.nextLine();  // Consume newline

                    switch (choice) {
                        case 1:
                            viewProducts();
                            break;
                        case 2:
                            System.out.print("Enter Product ID to add to cart: ");
                            int productId = sc.nextInt();
                            sc.nextLine();
                            Product product = findProductById(productId);
                            if (product != null) {
                                customer.addToCart(product);
                                System.out.println("Product added to cart.");
                            } else {
                                System.out.println("Product not found.");
                            }
                            break;
                        case 3:
                            System.out.print("Enter Product ID to remove from cart: ");
                            productId = sc.nextInt();
                            sc.nextLine();
                            customer.removeFromCart(productId);
                            System.out.println("Product removed from cart.");
                            break;
                        case 4:
                            customer.viewCart();
                            break;
                        case 5:
                            // Checkout
                            double totalAmount = 0;
                            for (Product p : customer.getCart()) {
                                totalAmount += p.price;
                            }
                            if (totalAmount > 0) {
                                PaymentProcessor paymentProcessor = new PaymentProcessor(1, totalAmount);
                                paymentProcessor.pay(totalAmount);
                                System.out.println("Thank you for your purchase!");
                            } else {
                                System.out.println("Your cart is empty. Add items before checkout.");
                            }
                            break;
                        case 6:
                            loggedIn = false;
                            System.out.println("Logged out successfully.");
                            break;
                        default:
                            System.out.println("Invalid choice. Try again.");
                            break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void viewProducts() {
        System.out.println("Available Products:");
        for (Product p : products) {
            System.out.println(p.getDetails());
        }
    }

    private static Product findProductById(int productId) {
        for (Product p : products) {
            if (p.getProductId() == productId) {
                return p;
            }
        }
        return null;
    }
}







