import java.util.Scanner;

public class Numbercheck {

    public static int checkNumber(int num) {
        if (num> 0) {
            return 1; 
        } else if (num < 0) {
            return -1; 
        } else {
            return 0;  
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input 
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Checking the number 
        int results = checkNumber(num);

        // Printing the result
        if (results == 1) {
            System.out.println("The number is positive.");
        } else if (results == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        input.close();
    }
}