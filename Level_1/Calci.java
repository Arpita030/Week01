import java.util.Scanner;
public class Calci{
public static void main(String[] args){
		   
	// Create a Scanner object to take user input
	Scanner sc = new Scanner(System.in);
	
	//taking input
	float number1=sc.nextFloat();
	float number2=sc.nextFloat();
	 
	//perform operations
	float add=number1+number2;
	float sub=number1-number2;
	float multiplication=number1*number2;
	float division=number1/number2;
	
	//display
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and "+ number2 + " is "+ add+" ,"+ sub+" ,"+ multiplication+" ,"+" and"+ division);
}
}