public class Universityfee{
	public static void main(String[]args){
		
		//intializing and declaring a variable
		int fee=125000;
		int discountPercent=10;
		
		
		// compute discount and discountedfee
		int discount=(125000/100)*10;
		int discountedFees= fee-discount;
		
		//displaying  the paying amount
		System.out.println(" The discount amount is INR " + discount+ "and final discounted fee is INR " +discountedFees);
	}
}
		
		
		
		