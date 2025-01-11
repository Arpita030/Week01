import java.util.Scanner;
public class Pendistribution{
	public static void main(String[]args){
		
	//declaring and intializing variable
	int pen=14;
	int student=3;
	//calculating distribution
       int perStudent=(pen/student);
	   int remainingPen=(pen%student);

	// Displaying the distribution among student and remaining pens
    	System.out.println("The Pen Per Student is "+ perStudent +" and the remaining pen not distributed is " +remainingPen);
	}
}