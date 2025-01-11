public class Leapyear {

    // Method using multiple if-else statements
    public static String checkLeapYmultipleIfElse(int year) {
        if (year < 1582) {
            return "Invalid year. The year must be >= 1582.";
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return year + " is a Leap Year.";
                } else {
                    return year + " is not a Leap Year.";
                }
            } else {
                return year + " is a Leap Year.";
            }
        } else {
            return year + " is not a Leap Year.";
        }
    }

    // Method using a single if statement with logical operators
    public static String checkLeapYearSingleIf(int year) {
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            return year + " is a Leap Year.";
        } else {
            return year + " is not a Leap Year.";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println("Using multiple if-else statements:");
        System.out.println(checkLeapYmultipleIfElse(year));

        System.out.println("\nUsing a single if statement with logical operators:");
        System.out.println(checkLeapYearSingleIf(year));

        scanner.close();
    }
}
