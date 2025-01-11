import java.util.Scanner;

public class Factorialusingforloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is a natural number (>= 0)
        if (number >= 0) {
            // Calculate factorial using for loop
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println(factorial);
        } 
        // Closing the scanner
        input.close();
    }
}
