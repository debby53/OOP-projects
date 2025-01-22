public class EvenNumbers import java.util.Scanner;

public class EvenNumbers {

    // Method to display even numbers
    public static void displayEvenNumbers(int[] numbers) {
        System.out.println("Even numbers are:");
        for (int number : numbers) {
            if (number % 2 == 0) {  // Check if the number is even
                System.out.print(number + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to insert: ");
        int n = scanner.nextInt();  // Input the size of the array

        int[] numbers = new int[n]; // Create an array of size n

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();  // Input the numbers
        }

        // Call the method to display even numbers
        displayEvenNumbers(numbers);
    }
}
{
}
