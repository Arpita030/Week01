import java.util.Scanner;

public class Weightconversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking input for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        
        // Conversion factor
        double poundsToKg = 2.2;
        
        // Converting pounds to kilograms
        double kilograms = pounds / poundsToKg;
        
        // Printing the result
        System.out.println("The weight of the person in pounds is " + pounds + " and in kg is " + kilograms);
    }
}
