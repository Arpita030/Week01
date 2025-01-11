import java.util.Scanner;

public class Triangularpark{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the sides of the triangular park
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();
        
        // Perimeter of the triangular park
        double perimeter = side1 + side2 + side3;
        
        // Distance to be covered (5 kilometers = 5000 meters)
        double totalDistance = 5000;  // in meters
        
        // Calculating the number of rounds
        double rounds = totalDistance / perimeter;
        
        // Printing the result
        System.out.println("The total number of rounds the athlete will run is " + (int)Math.ceil(rounds) + " to complete 5 km.");
    }
}
