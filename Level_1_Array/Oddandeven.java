import java.util.Scanner;

public class Oddandeven{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number=input.nextInt();
		
	    if(number>0){
		//array 
		int odd[]=new int[number/2+1];
		int even[]=new int[number/2+1];
		
		int oddIndex=0;
		int evenIndex=0;
		
	
        // Using a loop 
        for (int i = 1; i < number; i++){
			if(i%2==0){
				even[evenIndex]=i;
				evenIndex++;
			}
			else{
				odd[oddIndex]=i;
                oddIndex++;				
			}
		}
			System.out.println("odd integers are:");
			for (int i = 0; i < oddIndex; i++){
			System.out.println(odd[i]);
			}
			System.out.println("Even integers are:");
			for (int i = 0; i < evenIndex; i++){
			System.out.println(even[i]);
			}
		}
		else{
			System.out.println("invalid number");
		}
		input.close();
	}
}
		
		
				