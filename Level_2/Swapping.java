import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Taking input for number1
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        
        // Taking input for number2
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
        // Swapping the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;
        
        // Output
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
		input.close();
    }
}
