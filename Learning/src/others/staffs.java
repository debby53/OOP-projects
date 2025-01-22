import java.util.Scanner;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class staffs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the current time input from the user in 24-hour format
        System.out.print("Enter the current time (HH:mm) in your local time zone (24-hour format): ");
        String currentTimeInput = scanner.nextLine();
        LocalTime currentTime = LocalTime.parse(currentTimeInput, DateTimeFormatter.ofPattern("HH:mm"));

        // Set the local time in your current time zone (default zone will be system's default zone)
        ZonedDateTime localZonedDateTime = ZonedDateTime.now(ZoneId.systemDefault()).with(currentTime);

        // Prompt the user to select the time zone for conversion
        System.out.println("Select the time zone to convert to:");
        System.out.println("1. EST (Eastern Standard Time)");
        System.out.println("2. PST (Pacific Standard Time)");
        System.out.println("3. GMT (Greenwich Mean Time)");
        System.out.println("4. IST (Indian Standard Time)");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        ZonedDateTime convertedTime = null;

        // Convert the time based on user's choice using switch-case
        switch (choice) {
            case 1:
                // Convert to EST (Eastern Standard Time)
                convertedTime = localZonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
                break;
            case 2:
                // Convert to PST (Pacific Standard Time)
                convertedTime = localZonedDateTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
                break;
            case 3:
                // Convert to GMT (Greenwich Mean Time)
                convertedTime = localZonedDateTime.withZoneSameInstant(ZoneId.of("GMT"));
                break;
            case 4:
                // Convert to IST (Indian Standard Time)
                convertedTime = localZonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid number (1-4).");
                return;
        }

        // Output the converted time
        System.out.println("Converted Time: " + convertedTime.format(DateTimeFormatter.ofPattern("HH:mm")));
        scanner.close();
    }
}
