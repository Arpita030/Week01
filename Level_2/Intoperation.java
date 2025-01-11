import java.util.Scanner;
public class Intoperation{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		 // Input: Take values for a, b, and c
		int a= input.nextInt();
		int b= input.nextInt();
		int c= input.nextInt();
		
		
		// Perform integer operations
        int result1 = a + b * c;        
        int result2 = a * b + c;        
        int result3 = c + a / b;        
        int result4 = a % b + c;      

		
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