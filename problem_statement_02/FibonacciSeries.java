import java.util.Scanner;

public class FibonacciSeries {

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Number of terms must be greater than 0.");
            return;
        }

        long first = 0, second = 1;
        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fibonacci Sequence Generator");
        System.out.print("Enter the number of terms: ");

        try {
            int terms = scanner.nextInt();
            generateFibonacci(terms);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } finally {
            scanner.close();
        }
    }
}
