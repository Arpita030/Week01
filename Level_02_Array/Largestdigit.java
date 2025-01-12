import java.util.Scanner;

public class Largestdigit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input 
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        while (number <= 0) {
            System.out.print("Invalid input. Please enter a positive number: ");
            number = input.nextInt();
        }

        // Initializing variables here
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                // Increasing the size of the array by 10
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                //  copying the elements from digits array to temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Reassigning digit to the new array
                digits = temp;
            }

            digits[index] = number % 10; 
            number /= 10;                
            index++;
        }

        // Initializing variables for largest and second largest digits
        int largest = -1, secondLargest = -1;

        // Find the largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; 
                largest = digits[i];     
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; 
            }
        }

        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
    }
}