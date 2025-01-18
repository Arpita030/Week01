import java.util.Scanner;

public class PalindromeCheck {
    public static boolean ispalindrome(String s) {
        String reversed_text = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed_text += s.charAt(i);
        }
        return reversed_text.equals(s);
    }

    public static void display(boolean ispalindrome) {
        if (ispalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        boolean result = ispalindrome(text);
        display(result);
    }
}