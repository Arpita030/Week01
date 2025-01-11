import java.util.Scanner;
public class Sumofnumber{
	public static void main(String[]args){
		Scanner input =new Scanner(System.in);
		
		    int n=10;
			
			//array creation
		    double number[]=new double[n];
			double total=0.0;
			int index=0;
			
			while (true){
				if(index<10){
					System.out.println("enter the number");
                    double temp=input.nextDouble();
					if(temp<=0){
						break;
					}
					number[index]=temp;
					index++;
				}
				else{
					break;
				}
			}
			for(int i=0;i<index;i++){
				total+=number[i];
						}
			System.out.println("total sum is"+total);
		
			
	input.close();
	}
}