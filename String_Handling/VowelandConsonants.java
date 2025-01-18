import java.util.Scanner;
public class VowelandConsonants{
 public static int[] VowelandConsonants(String vowel){
        
		int[] arr= {0,0};
		for(int i=0;i<vowel.length();i++)
			
			{
				if((vowel.charAt(i)=='a') || (vowel.charAt(i)=='e') || (vowel.charAt(i)=='i') || (vowel.charAt(i)=='o') || (vowel.charAt(i)=='u'))
				{
					arr[0]++;
				}
				else
				{
					arr[1]++;
				}	
			}
			return arr;
	}
	
	
	
	
	public static void main(String args[])
	
	{
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter an String");
		String str= input.nextLine();
		int values[]=VowelandConsonants(str);
		System.out.println("Number of Vowels :"+values[0]);
		System.out.println("Number of consonents is :"+values[1]);
			
		
	}
}