 import java.util.Scanner;
public class Doubleopt{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		 // Input: Take values for a, b, and c
		double a= input.nextDouble();
		double b= input.nextDouble();
		double c= input.nextDouble();
		
		
		// Perform integer operations
        double result1 = a + b * c;        
        double result2 = a * b + c;        
        double result3 = c + a / b;        
        double result4 = a % b + c;      

		
        // Output: Display the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        // Close the scanner
        input.close();
    }
}