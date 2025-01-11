import java.util.Scanner;

public class Sumofnumbersnegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializeing
        double totalof = 0.0;

        // Loop to take user input and add to the total until user enters 0
        while (true) {
            System.out.print("Enter a number (enter 0 to stop): ");
            double userInput = scanner.nextDouble();

            // Break the loop if the user enters 0
            if (userInput <= 0 ) {
                break;
            }

            totalof += userInput; // Add the user input to the total
        }

        // Print the total sum
        System.out.println("The total sum is: " + totalof);

        scanner.close();
    }
}