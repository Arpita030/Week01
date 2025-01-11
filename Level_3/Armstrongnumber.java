import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int original = number; 
        int sum = 0;                

        while (original != 0) {
            int remainder = original % 10;

            sum += Math.pow(remainder, 3);

            original /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        input.close();
    }
}
