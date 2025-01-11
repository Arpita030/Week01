import java.util.Scanner;
public class Votingeligibility{
	public static void main(String[]args){
		Scanner input =new Scanner(System.in);
		
		int n=10;
		int age[]=new int[n];
		
		for (int i=0;i<n;i++){
			System.out.println("enter your age:");
			age[i]=input.nextInt();
		
			if(age[i]>0){
				
				if(age[i]>=18){
					System.out.println(" The student with the age "+age[i]+" can vote");
				}
				else{
					System.out.println("The student with the age "+age[i]+" cannot vote.");
			}
			}
			else{
			    System.out.println("Invalid age");
            }
	}
	input.close();
	}

}
		
		  