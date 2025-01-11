import java.util.Scanner;

public class Harshadnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        int original = number; // Original number for digit extraction

        while (original != 0) {
            int digit = original % 10;
            sum += digit;
            original /= 10;
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        input.close();
    }
}
