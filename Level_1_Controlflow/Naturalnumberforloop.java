import java.util.Scanner;

public class Naturalnumberforloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is a natural number (>= 0)
        if (number >= 0) {
            // Sum through while loop
            int forLoop = 0;
            for(int i=1; i<=number;i++){
				forLoop+=i;
            }

            // Sum using formula
            int sum = number * (number + 1) / 2;

            // Comparing results
            if (forLoop == sum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There seems to be a discrepancy.");
            }
        } 
        input.close();
    }
}