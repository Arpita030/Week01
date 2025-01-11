import java.util.Scanner;
public class Universityfees{
	public static void main(String[]args){
		
		//intializing and declaring a variable
		Scanner sc=new Scanner(System.in);
		int fee;
		fee=sc.nextInt();
		
		int discountPercent;
		discountPercent=sc.nextInt();

		
		
		// compute discount and discountedfee
		int discount=(125000/100)*10;
		int discountedFees= fee-discount;
		
		//displaying  the paying amount
		System.out.println(" The discount amount is INR " + discount+ "and final discounted fee is INR " +discountedFees);
	}
}
		
		
		
		