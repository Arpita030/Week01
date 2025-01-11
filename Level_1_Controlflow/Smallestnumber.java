import java.util.Scanner;
public class Smallestnumber{
      public static void main(String [] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		//taking inputs 
		  int number1=input.nextInt();
		  int number2=input.nextInt();
		  int number3=input.nextInt();
		  
		  String answer;
		  
		  
		//check conditions
		  if(number1<number2 && number1<number3){
		     answer="Yes";
		  }
		  else{
		     answer="No";
		  }
		 
		  
		  
		//displaying the results
          System.out.println("Is the first number the smallest? "+answer);		
		  
		  input.close();
	  }  
}