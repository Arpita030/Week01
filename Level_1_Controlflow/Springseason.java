import java.util.Scanner;
public class Springseason{
public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	 
	System.out.print("Enter month (1-12): ");
	int month=input.nextInt();
	
	System.out.print("Enter day (1-31): ");
	int day=input.nextInt();

	
	
	//conditions
	if ((month == 3 && day >= 20 && day <= 31) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
	}
	else{
		System.out.println("Not a Spring Season.");
	}
	input.close();
}
}


		