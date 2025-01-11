
import java.util.Scanner;
public class Tempconversion {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Print the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

        // Close the scanner
        sc.close();
    }
}
