import java.util.Scanner;

public class MaximumNumber {
    public static int[] getInput() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];

        try {
            System.out.println("Enter the  first number :");
            numbers[0] = input.nextInt();

            System.out.println("Enter  the Second number :");
            numbers[1] = input.nextInt();

            System.out.println("Enter the Third number :");
            numbers[2] = input.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a valid number!");
            input.nextLine();
            return getInput();
        }
        return numbers;
    }

    public static int findMaximum(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static void main(String[] args) {
        System.out.println("Find the maximum of three numbers.");

        int[] numbers = getInput();

        // Find and display the maximum
        int maximum = findMaximum(numbers[0], numbers[1], numbers[2]);
        System.out.println("The maximum of the three numbers is: " + maximum);
    }
}
