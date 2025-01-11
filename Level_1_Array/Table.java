import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = input.nextInt();

        int multiple[] = new int[4]; // Array to store results for 6, 7, 8, and 9

        // Using a loop to calculate the multiplication table
        for (int i = 6; i <= 9; i++) {
            multiple[i - 6] = number * i; // Store results in the array
        }

        System.out.println("Multiplication Table of " + number + " (from 6 to 9):");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiple[i - 6]);
        }

        input.close();
    }
}