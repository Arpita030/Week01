import java.util.Scanner;

public class Factor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking users input
        System.out.print("Enter a number to find its factors: ");
        int num = input.nextInt();

        // Check for positive numbers only
        if (num <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Factors of " + num + " are:");

            // Loop to find and print factors
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) { // 
                    System.out.println(i); // 
                }
            }
        }

        input.close();
    }
}
