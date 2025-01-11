import java.util.Scanner;
public class Perimeterofsquare{
public static void main(String[] args){
		   
	// Create a Scanner object to take user input
	Scanner input = new Scanner(System.in);
	
	//taking input
	double side=input.nextDouble();
	 
	//perform operations
	double perimeter = 4*side;
	
	//display
	System.out.println("The length of the side is "+side+"whose perimeter is "+perimeter);
	input.close();
}
}
