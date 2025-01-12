import java.util.Scanner;

public class Naturalnumber {

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int answer = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + answer);
        }

        input.close();
    }
}


