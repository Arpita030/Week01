import java.util.Scanner;
public class Sumofnumbers {

   
    public static void main(String Args[]) {
     Scanner input = new Scanner(System.in);
          
		  //Declaring total variable with 0.0
        double totalof=0.0;
		
		
		// Taking input from user to enter the number
		System.out.println("Enter the number\n Enter 0 to stop ");
		double userinput=input.nextInt();
		
		
		//Check until user enter 0 and also add the total sum
		while(userinput!=0)
		{
			totalof=totalof+userinput;
			
			System.out.println("Enter another number\n Enter 0 to stop");
			userinput= input.nextDouble();
			
		}
		
		//Printing the total sum
		System.out.println("Total sum is: "+totalof);
					
			 
      // Closing the object
        input.close();
    }
}