import java.util.Scanner;
public class Calculation{
	public static void main(String[]args){
	
	// declaring variable and intializing the variables
	double costPrice = 129;
	double sellingPrice = 191;
	
	//calculating profit and percentage 
	 double profit = sellingPrice - costPrice;
	 double profitPercentage = (profit / costPrice) * 100;
	 
	//displaying the  profit and profit percentage
	System.out.println("The Cost Price is INR "+ costPrice +" and Selling Price is INR "+ sellingPrice +"\nThe Profit is INR " + profit +
 "and the Profit Percentage is" + profitPercentage);
}
}