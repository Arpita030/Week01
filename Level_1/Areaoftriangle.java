import java.util.Scanner;
public class Areaoftriangle{
public static void main(String[] args){
		   
	// Create a Scanner object to take user input
	Scanner sc = new Scanner(System.in);
	
	//taking input
	double base=sc.nextDouble();
	double height=sc.nextDouble();
	 
	//perform operations
	double area=(((double) 1/2)*base*height);
	
	//display
	System.out.println(" base is"+ base+"while height is"+height+"and area is"+area);
	sc.close();
}
}
