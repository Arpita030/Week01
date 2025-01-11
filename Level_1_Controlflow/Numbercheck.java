import java.util.Scanner;
public class Numbercheck{
public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	 
	int number=input.nextInt();
	
	
	//conditions
	if (number>0){
		System.out.println("positive");
	}
	else if (number<0){
		System.out.println("Negative");
	}
	else{
		System.out.println("Zero");
	}
	input.close();
}
}


		