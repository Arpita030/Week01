import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n = n * factorial(n - 1);
    }

    public static int getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        return sc.nextInt();
    }

    public static void displayResult(int result) {
        System.out.println("The factorial is: " + result);
    }

    public static void main(String[] args) {
        int n = getinput();
        int factorialResult = factorial(n);
        displayResult(factorialResult);
    }
}