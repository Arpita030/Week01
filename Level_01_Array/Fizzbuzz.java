import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        String[] fizzBuzzArray = new String[num + 1];

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzzArray[i] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzzArray[i] = "Buzz";
            } else {
                fizzBuzzArray[i] = i + "";  // Concatenating integer with an empty string
            }
        }

        for (int i = 1; i <= num; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzArray[i]);
        }

        input.close();
    }
}