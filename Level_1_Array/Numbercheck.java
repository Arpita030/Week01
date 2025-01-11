import java.util.Scanner;
public class Numbercheck{
	public static void main(String[]args){
		Scanner input =new Scanner(System.in);
		
		int n=5;
		int num[]=new int[n];
		
		for (int i=0;i<n;i++){
			System.out.println("enter your number:");
			num[i]=input.nextInt();
		
			if(num[i]>0){
				if(num[i]%2 == 0){
					System.out.println(" The number is even");	
				}
				else{
					System.out.println(" The number is odd");	
				}
			}
			else if(num[i]<0){
					System.out.println(" The number is negative");	
			}
			else{
				System.out.println(" The number is Zero");	
				}
		}
			if (num[0]== num[num.length-1]){
				System.out.println(" Equal");	
			}
			else if(num[0]>num[num.length-1]){
					System.out.println(" The first number is greater than last");	
			}
			else{
					System.out.println(" The first number is less than last");	
				}
			
	input.close();
	}

}
		
		  
	