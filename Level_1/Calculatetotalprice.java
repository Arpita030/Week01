import java.util.Scanner;
public class Calculatetotalprice{
public static void main(String[] args){
		   
	// Create a Scanner object to take user input
	Scanner input = new Scanner(System.in);
	
	//taking input
	int unitprice=input.nextInt();
	int quantity=input.nextInt();

	 
	//perform operations
		int totalprice=unitprice*quantity;


	
	//display
	System.out.println("The total purchase price is INR "+ totalprice + "if the quantity  "+ quantity +" and unit price is INR "+unitprice );
	input.close();
}
}
