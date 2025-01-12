import java.util.Scanner;

public class Leapyear {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Year must be greater than or equal to 1582 (Gregorian calendar start)
        if (year < 1582) {
            return false;
        }
        
        // Leap year conditions
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;  // Divisible by 400
                } else {
                    return false; // Divisible by 100 but not 400
                }
            } else {
                return true; // Divisible by 4 but not 100
            }
        } else {
            return false; // Not divisible by 4
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take year as input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}