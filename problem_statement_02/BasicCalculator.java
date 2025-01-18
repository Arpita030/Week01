import java.util.Scanner;

public class BasicCalculator {

    static class Calculator {
        double Addition(double a, double b) {
            return a + b;
        }

        double Multiplication(double a, double b) {
            return a * b;
        }

        double Division(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Division by zero is not allowed.");
                return Double.NaN;
            }
        }

        double subtraction(double a, double b) {
            return a - b;
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First number:");
        double a = input.nextDouble();

        System.out.println("Enter Second number:");
        double b = input.nextDouble();

        System.out.println("Enter symbol to perform operation (+, -, *, /):");
        char ch = input.next().charAt(0);

        Calculator c1 = new Calculator();
        double result;

        switch (ch) {
            case '+':
                result = c1.Addition(a, b);
                break;
            case '-':
                result = c1.subtraction(a, b);
                break;
            case '*':
                result = c1.Multiplication(a, b);
                break;
            case '/':
                result = c1.Division(a, b);
                break;
            default:
                System.out.println("Invalid operator.");
                input.close();
                return;
        }

        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
        input.close();
    }
}
