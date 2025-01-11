import java.util.Scanner;

public class Naturalnumberwhileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is a natural number (>= 0)
        if (number >= 0) {
            // Sum through while loop
            int sumWhileLoop = 0;
            int i = 1;
            while (i <= number) {
                sumWhileLoop += i;
                i++;
            }

            // Sum using formula
            int sum = number * (number + 1) / 2;

            // Comparing results
            if (sumWhileLoop == sum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There seems to be a discrepancy.");
            }
        } 
        input.close();
    }
}
