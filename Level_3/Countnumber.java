import java.util.Scanner;

public class Countnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    // input
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int count = 0;
    //condition
        if (num == 0) {
            count = 1;
        } else {
            // Loop 
            while (num != 0) {
                // Remove the last digit from the number
                num /= 10;

                // Increment the count
                count++;
            }
        }

        System.out.println("The number of digits is: " + count);

        input.close();
    }
}
