import java.util.Scanner;

public class Rocketlaunch {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the countdown value: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter > 0) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }
        // Close the scanner
        sc.close();
    }
}
