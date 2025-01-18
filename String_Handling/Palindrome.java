import java.util.Scanner;
     public class Palindrome{
	public static boolean Ispalindrome(String s){
		String reverse="";
		for(int i=s.length()-1;i>=0;i--){
			reverse+=s.charAt(i);
		}
		return reverse.equals(s);
	}
	public static void main(String []args){
		System.out.println("Enter a String :");
		Scanner input=new Scanner(System.in);
		String s=input.next();
		boolean result=Ispalindrome(s);
		System.out.println("Is the  String: "+s+" palindrome: "+result);
	}
	 }
	 

		
	