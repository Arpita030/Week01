import java.util.Scanner;
public class Totalincome {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the salary
        System.out.print("Enter the salary in INR: ");
        double salary = sc.nextDouble();

        // Prompt the user to enter the bonus
        System.out.print("Enter the bonus in INR: ");
        double bonus = sc.nextDouble();

        // Compute the total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome + ".");

        // Close the scanner
        sc.close();
    }
}
