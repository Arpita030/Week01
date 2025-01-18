import java.util.Scanner;

public class Gcd {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        return new int[] { num1, num2 };
    }

    public static void displayResults(int gcd, int lcm) {
        System.out.println("Greatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);
    }

    public static void main(String[] args) {
        int[] numbers = getInput();
        int gcdResult = gcd(numbers[0], numbers[1]);
        int lcmResult = lcm(numbers[0], numbers[1]);
        displayResults(gcdResult, lcmResult);
    }
}
