import java.util.Scanner;

public class Power{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
         
		//intialization
        int result = 1;

        // Loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result=result*number;  

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        input.close();
		}
	}
}
  