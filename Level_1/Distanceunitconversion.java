import java.util.Scanner;
public class Distanceunitconversion{
public static void main(String[] args){
		   
	// Create a Scanner object to take user input
	Scanner input = new Scanner(System.in);
	
	//taking input
	double distanceInFeet=input.nextDouble();
	 
	//perform operations
	double distanceInYard=distanceInFeet/3;
	double distanceInMile=distanceInYard/1760;

	
	//display
	System.out.println("Your Height in cm is "+ distanceInFeet + "while in feet is  "+ distanceInYard +" and inches is "+distanceInMile );
	input.close();
}
}
