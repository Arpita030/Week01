import java.util.Scanner;

public class Meanheight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n=11;
		
		//array 
		double height[]=new double[n];
		double total=0.0;
		
	
        // Using a loop 
        for (int i = 0; i < height.length; i++) {
			System.out.println("enter your height:");
				height[i]=input.nextDouble();
				total+=height[i];
        }
        double mean= total/11;
		System.out.println("mean height of the football "+mean);
	input.close();
	}
}
	
	