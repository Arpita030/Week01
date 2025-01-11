import java.util.Scanner;

public class Factorialusingwhileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        // Check if the number is positive
        if (num >= 0) {
            // Calculate factorial using while loop
            long factorial = 1;
            int i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Closing the scanner
        input.close();
    }
}
