import java.util.Scanner;

public class Simpleinterest
 {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 // Take input from user
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = input.nextDouble();

        // Calculate simple interest 
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Printing the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f, and Time %.2f years.%n",
                simpleInterest, principal, rate, time);


        input.close();
    }
}