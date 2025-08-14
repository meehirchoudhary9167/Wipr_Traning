package Day1;
import java.util.Scanner;

public class UserInputData {

	public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display the input
        System.out.println("You entered: " + number);

        // Close the scanner
        scanner.close();
    }
}
