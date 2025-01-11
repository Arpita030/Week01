import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        // using for loop
        for (int i = 100; i >= 1; i--) {
            // Checking if i is a multiple of the input number or not
            if (i % num == 0) {
                System.out.println(i);
            }
        }
        
        input.close();
    }
}