
import java.util.Scanner;
public class Distancekmtomile{
	public static void main(String[]args){
		
		// Create a Scanner object to take user input
		Scanner sc=new Scanner(System.in);
		
		
		// Declare a variable for kilometers
		double km;
		km = sc.nextDouble();
		
		//convert km to miles
		double miles =km/1.6;
		 
		 
		// Display the result
		 System.out.println("The total miles is " + miles + " for the given : " + km);
    }
}
