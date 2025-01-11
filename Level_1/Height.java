
import java.util.Scanner;
public class Height{
	public static void main(String[]args){
		
	    // Create a Scanner object to take user input
		Scanner sc=new Scanner(System.in);
		
		
		//intializing and declaring a variable
		double height;
		height=sc.nextDouble();
		
		//calculating height in inches
	     double heightInInches= height/2.54;
		 
		 //calculating height in feet
	     double heightInfeet= heightInInches/12;
		
		
		
		//displaying  the height
		System.out.println(" Your Height in cm is "+ height + " while in feet is " + heightInfeet  + "and inches is" +heightInInches);
	}
}
		
		
		