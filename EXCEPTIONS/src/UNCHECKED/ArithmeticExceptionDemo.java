package UNCHECKED;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Occurs when an arithmetic operation fails, e.g., division by zero.
        try {



            System.out.println("enter total price of items");
            double totalPrice = sc.nextDouble();
            System.out.print("Enter the number of items: ");
            int numberOfItems = sc.nextInt();

            if(numberOfItems==0){
                System.out.println("Error: Cannot divide by zero. Please enter a valid number of items.");
            }else {

                double averagePrice = totalPrice / numberOfItems;
                System.out.println("The average price per item is: " + averagePrice);
            }
        }catch (ArithmeticException e){
            // Handle division by zero
            System.out.println("Error: Cannot divide by zero. Please enter a valid number of items. "+ e.getMessage());
        }finally {
            sc.close();
        }
    }
}
/*Summary:
The most common cause for ArithmeticException is division by zero, but it can also occur in scenarios involving integer
 overflow, modulo by zero, and other edge cases related to arithmetic operations. When writing programs that involve
 arithmetic, it's essential to anticipate these cases and handle them properly to avoid unexpected exceptions.
 */
