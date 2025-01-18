import java.util.Scanner;

public class TempratureConverter {
    public static double fahrenheittoCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiustofahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double getTemperature(String scale) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in " + scale + ": ");
        return scanner.nextDouble();
    }

    // Method to display the converted temperature
    public static void displayConvertedTemperature(double temperature, String scale) {
        System.out.println("Converted temperature: " + temperature + " " + scale);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Convert from (C/F): ");
        char choice = scanner.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            double celsius = getTemperature("Celsius");
            double fahrenheit = celsiustofahrenheit(celsius);
            displayConvertedTemperature(fahrenheit, "Fahrenheit");
        } else if (choice == 'F') {
            double fahrenheit = getTemperature("Fahrenheit");
            double celsius = fahrenheittoCelsius(fahrenheit);
            displayConvertedTemperature(celsius, "Celsius");
        } else {
            System.out.println("Invalid choice. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }
    }
}