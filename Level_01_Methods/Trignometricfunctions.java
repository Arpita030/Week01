import java.util.Scanner;

public class Trignometricfunctions {

    public static double[] calculateTrigonometricFunctions(double angle) {
      
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);


        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

      
        double[] trigFunctions = calculateTrigonometricFunctions(angle);

        System.out.printf("Sine of %.2f degrees: %.4f\n", angle, trigFunctions[0]);
        System.out.printf("Cosine of %.2f degrees: %.4f\n", angle, trigFunctions[1]);
        System.out.printf("Tangent of %.2f degrees: %.4f\n", angle, trigFunctions[2]);

        input.close();
    }
}